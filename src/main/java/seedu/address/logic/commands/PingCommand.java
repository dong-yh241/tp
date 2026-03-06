package seedu.address.logic.commands;

import seedu.address.logic.commands.exceptions.CommandException;
import seedu.address.model.Model;

/**
 * Replies with "pong" to test that the command pipeline is working.
 */

public class PingCommand extends Command {

    public static final String COMMAND_WORD = "ping";
    public static final String MESSAGE_SUCCESS = "pong";

    @Override
    public CommandResult execute(Model model) throws CommandException {
        return new CommandResult(MESSAGE_SUCCESS);
    }
}
