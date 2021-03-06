package com.lingdu.parser.function;

import java.util.List;

import com.lingdu.operands.CountOprand;
import com.lingdu.operands.Oprand;

class CountFuncation
implements Funcation
{
public Object call(Object... args)
{
    Oprand op = null; 
    if(args[0] instanceof List){
        op = (Oprand)((List)args[0]).get(0);
    }
    String alias = null;
    if(args.length==2){
        alias = args[1].toString();
    }
  return new CountOprand("count", op,alias);
}
}
