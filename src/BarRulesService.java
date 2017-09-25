/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Doern
 */
public class BarRulesService implements BilliardsRuleService {

    @Override
    public String scratch() {
        return "You may place the ball behind the line or second diamond on the breaking side of the table (in the kitchen)";
    }
    
}
