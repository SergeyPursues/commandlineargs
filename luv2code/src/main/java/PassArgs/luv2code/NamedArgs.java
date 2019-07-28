package PassArgs.luv2code;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;


public class NamedArgs 
{
	public static void main(String[] args) throws ParseException {
		//Create GNU like options
	      Options gnuOptions = new Options();
	      gnuOptions.addOption("p", "print", false, "Print")
	         .addOption("g", "gui", false, "GUI")
	         .addOption("n", true, "Scale")
	         .addOption("d", true, "Description");

	      CommandLineParser parser = new DefaultParser();
	      CommandLine cmd = parser.parse(gnuOptions, args);

	      if( cmd.hasOption("p") ) {
	         System.out.println("p option was used.");
	      }

	      if( cmd.hasOption("g") ) {
	         System.out.println("g option was used.");
	      }

	      if( cmd.hasOption("n") ) {
	         System.out.println("Value passed: " + cmd.getOptionValue("n"));
	      }
	      
	      if( cmd.hasOption("d") ) {
		         System.out.println("Value passed: " + cmd.getOptionValue("d"));
		  }
	   } 

	}

