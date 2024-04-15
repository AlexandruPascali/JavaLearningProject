package md.tekwillacademy.gitworkflow;

public class GitWorkFlow {
    public static void main(String[] args) {
        String step1 = "Perform git stash - to store the uncommitted changes";
        String step2 = "Perform git checkout master - to move to the local master branch";
        String step3 = "Perform git fetch - sync with origin/master";
        String step4 = "Perform git pull - to retrieve changes from a remote repository";
        String step5 = "Perform git checkout -b new_branch_name - to create and instantly move to a new branch";
        String step6 = "Add code changes that related to the task";
        String step7 = "Perform git commit - to save the changes on local memory";
        String step8 = "Perform git push - to upload the changes on the remote repository(cloud)";
        String step9 = "Navigate the GitHub repository";
        String step10 = "Create a Pull Request from origin/new_branch_name into origin/master";
        String step11 = "Invite the collaborators to review the code";
        String step12 = "Perform git merge after collaborators approval";
        String step_12_1 = "If changes are required then I have to modify my local branch and perform a git commit amend";
        String step_12_2 = "After git commit amend, we have to do a git push -f ";
        String step13 = "Delete the created secondary branch(origin/new_branch_name) as it is already merged";
        String step14 = "Go to IntellijIdea and perform git checkout master";
        String step15 = "Perform git fetch + git pull - to add changes to the local master branch";


        System.out.println(step1);
        System.out.println(step2);
        System.out.println(step3);
        System.out.println(step4);
        System.out.println(step5);
        System.out.println(step6);
        System.out.println(step7);
        System.out.println(step8);
        System.out.println(step9);
        System.out.println(step10);
        System.out.println(step11);
        System.out.println(step12);
        System.out.println(step_12_1);
        System.out.println(step_12_2);
        System.out.println(step13);
        System.out.println(step14);
        System.out.println(step15);


    }
}
