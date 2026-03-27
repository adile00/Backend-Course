package lesson03;

public class Task08MediumPermissionFlags {
    public static final int READ = 1;
    public static final int WRITE = 2;
    public static final int EXPORT = 4;
    public static final int AUDIT = 8;

    public static void main(String[] args) {
        int userPermissions = READ | WRITE; // User has read and write permissions
        System.out.println("User permissions mask: " + userPermissions);

        // Check if user has read permission
        if ((userPermissions & READ) != 0) {
            System.out.println("User has READ permission.");
        } else {
                System.out.println("User does NOT have READ permission.");
            }
        // Check if user has export permission
        if ((userPermissions & EXPORT) != 0) {
            System.out.println("User has EXPORT permission.");
        } else {
            System.out.println("User does NOT have EXPORT permission.");
        }
        System.out.printf("----------------------------------\n");

        // Update mask to add export permission
        userPermissions |= EXPORT; // Now user has read, write, and export permissions
        System.out.println("Updated user permissions mask: " + userPermissions);

        // Check if user has export permission again
        if ((userPermissions & EXPORT) != 0) {
            System.out.println("User has EXPORT permission.");
        } else {
            System.out.println("User does NOT have EXPORT permission.");
        }
        System.out.printf("----------------------------------%n");

        // Update mask to remove write permission
        userPermissions &= ~WRITE; // Now user has read and export permissions, but not write
        System.out.println("Updated user permissions mask after removing WRITE: " + userPermissions);

        // Check if user has write permission again
        if ((userPermissions & WRITE) != 0) {
            System.out.println("User has WRITE permission.");
        } else {
            System.out.println("User does NOT have WRITE permission.");
        }
        System.out.printf("----------------------------------%n");

        // Update mask to toggle audit permission
        userPermissions ^= AUDIT; // Now user has read, export, and audit permissions
        System.out.println("Updated user permissions mask after toggling AUDIT: " + userPermissions);

        // Check if user has audit permission
        if ((userPermissions & AUDIT) != 0) {
            System.out.println("User has AUDIT permission.");
        } else {
            System.out.println("User does NOT have AUDIT permission.");
        }


    }

}
