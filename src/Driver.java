/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Doern
 */
public class Driver {
    public static void main(String[] args) {
        BilliardsRuleService bcaRules = new BCARulesService();
        BilliardsRuleService barRules = new BarRulesService();
        
        BilliardsService test = new BilliardsService(bcaRules);
        System.out.println("This is the scratch rule in BCA: ");
        test.scratch();
        System.out.println("This is the scratch rule when you're playing \"Bar Rules\":");
        test.setRuleset(barRules);
        test.scratch();
        
        
    }
}
