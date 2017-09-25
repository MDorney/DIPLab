/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Doern
 */
public class BilliardsService {
    
    private BilliardsRuleService ruleset;

    
    public BilliardsService(BilliardsRuleService ruleset) {
        this.ruleset = ruleset;
    }
    
    public void scratch() {
        System.out.println(ruleset.scratch());
    }

    public BilliardsRuleService getRuleset() {
        return ruleset;
    }

    public void setRuleset(BilliardsRuleService ruleset) {
        this.ruleset = ruleset;
    }
}
