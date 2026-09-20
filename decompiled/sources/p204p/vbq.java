package p204p;

import com.spotify.player.model.Context;
import com.spotify.player.model.command.PlayCommand;
import com.spotify.player.model.command.options.LoggingParams;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.completable.CompletableOnErrorComplete;

/* JADX INFO: loaded from: classes2.dex */
public final class vbq implements th00 {

    /* JADX INFO: renamed from: a */
    public final qoo0 f239551a;

    /* JADX INFO: renamed from: b */
    public final scn f239552b;

    /* JADX INFO: renamed from: c */
    public final nbm0 f239553c;

    /* JADX INFO: renamed from: d */
    public final String f239554d;

    public vbq(qoo0 qoo0Var, scn scnVar, nbm0 nbm0Var, String str) {
        this.f239551a = qoo0Var;
        this.f239552b = scnVar;
        this.f239553c = nbm0Var;
        this.f239554d = str;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00f3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:50:0x00f4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p204p.th00
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(ae3 ae3Var, fbk fbkVar) {
        ubq ubqVar;
        String str;
        String str2;
        if (fbkVar instanceof ubq) {
            ubqVar = (ubq) fbkVar;
            int i = ubqVar.f228877c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ubqVar.f228877c = i - Integer.MIN_VALUE;
            } else {
                ubqVar = new ubq(this, fbkVar);
            }
        } else {
            ubqVar = new ubq(this, fbkVar);
        }
        Object obj = ubqVar.f228875a;
        int i2 = ubqVar.f228877c;
        w2a1 w2a1Var = w2a1.f247311a;
        if (i2 != 0) {
            if (i2 == 1) {
                bga.m29073P(obj);
                return w2a1Var;
            }
            if (i2 == 2) {
                bga.m29073P(obj);
                return w2a1Var;
            }
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
            return w2a1Var;
        }
        bga.m29073P(obj);
        String str3 = ae3Var.f14732j;
        String str4 = ae3Var.f14734l;
        String strM93273j = ybg1.m93273j(this.f239554d, str3);
        boolean z = ae3Var.f14733k && wj50.m88271j(strM93273j, str4);
        boolean zM88271j = wj50.m88271j(strM93273j, str4);
        qoo0 qoo0Var = this.f239551a;
        scn scnVar = this.f239552b;
        yuk yukVar = yuk.f276404a;
        if (z) {
            hrw hrwVarM77807a = scnVar.m77807a();
            qoo0Var.getClass();
            Single singleMo48412a = hrwVarM77807a.mo48412a(h8p0.m46835c("your-library", false));
            ubqVar.f228877c = 1;
            if (zn91.m96567o(singleMo48412a, ubqVar) == yukVar) {
                return yukVar;
            }
            return w2a1Var;
        }
        if (zM88271j) {
            hrw hrwVarM77807a2 = scnVar.m77807a();
            qoo0Var.getClass();
            Single singleMo48412a2 = hrwVarM77807a2.mo48412a(h8p0.m46837e("your-library", false));
            ubqVar.f228877c = 2;
            if (zn91.m96567o(singleMo48412a2, ubqVar) == yukVar) {
                return yukVar;
            }
            return w2a1Var;
        }
        uqw uqwVarM77810d = scnVar.m77810d();
        PlayCommand.Builder builder = PlayCommand.builder(Context.fromUri(strM93273j), qoo0Var.m73402a(strM93273j));
        LoggingParams.Builder builder2 = LoggingParams.builder();
        z650 z650Var = ae3Var.f14735m;
        String str5 = "";
        if (z650Var == null || (str = z650Var.f279709a) == null) {
            str = "";
        }
        LoggingParams.Builder builderInteractionId = builder2.interactionId(str);
        kbm0 kbm0Var = this.f239553c.get();
        if (kbm0Var != null && (str2 = kbm0Var.f121231a) != null) {
            str5 = str2;
        }
        Completable completableIgnoreElement = uqwVarM77810d.m83821a(builder.loggingParams(builderInteractionId.pageInstanceId(str5).build()).build()).ignoreElement();
        completableIgnoreElement.getClass();
        CompletableOnErrorComplete completableOnErrorCompleteM23299p = completableIgnoreElement.m23299p(Functions.f7232h);
        ubqVar.f228877c = 3;
        if (zn91.m96565n(completableOnErrorCompleteM23299p, ubqVar) == yukVar) {
            return yukVar;
        }
        return w2a1Var;
    }
}
