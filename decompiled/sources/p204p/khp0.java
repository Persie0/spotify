package p204p;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes8.dex */
public abstract class khp0 {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public static final Object m56450a(yz80 yz80Var, String str, String str2, int i, ibk ibkVar) {
        jhp0 jhp0Var;
        if (ibkVar instanceof jhp0) {
            jhp0Var = (jhp0) ibkVar;
            int i2 = jhp0Var.f112547c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jhp0Var.f112547c = i2 - Integer.MIN_VALUE;
            } else {
                jhp0Var = new jhp0(ibkVar);
            }
        } else {
            jhp0Var = new jhp0(ibkVar);
        }
        Object objM63317n = jhp0Var.f112546b;
        int i3 = jhp0Var.f112547c;
        try {
            if (i3 == 0) {
                bga.m29073P(objM63317n);
                List listSingletonList = Collections.singletonList(str2);
                jhp0Var.f112545a = i;
                jhp0Var.f112547c = 1;
                objM63317n = ((n090) yz80Var).m63317n(str, listSingletonList, jhp0Var);
                yuk yukVar = yuk.f276404a;
                if (objM63317n == yukVar) {
                    return yukVar;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i = jhp0Var.f112545a;
                bga.m29073P(objM63317n);
            }
            p2x0 p2x0Var = (p2x0) objM63317n;
            if (p2x0Var instanceof m2x0) {
                return new zhp0(i);
            }
            if (p2x0Var instanceof k2x0) {
                return new yhp0(i);
            }
            throw new NoWhenBranchMatchedException();
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
            return new yhp0(i);
        }
    }
}
