package generics_set_map.set;

import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class ProgramExercise {

    public static void main(String[] args) {

        // Simula os inputs
        String lines = """
                       Maria 2025-10-14T12:00:00Z
                       Alex 2025-08-22T12:00:00Z
                       Bob 2025-01-30T12:00:00Z
                       Maria 2025-04-16T12:00:00Z
                       Bob 2025-02-25T12:00:00Z
                       """;

        String[] entries = lines.split("\n");
        Set<LogEntry> setEntries = new HashSet<>();

        for (String entry : entries) {
            String[] parts = entry.split(" ");

            String username = parts[0];
            Date moment = Date.from(Instant.parse(parts[1]));

            setEntries.add(new LogEntry(username, moment));
        }

        System.out.println("Quantidade de usuários únicos: " + setEntries.size());

    }

}
