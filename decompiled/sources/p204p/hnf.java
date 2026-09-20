package p204p;

import java.util.UUID;

/* JADX INFO: loaded from: classes9.dex */
public final class hnf {

    /* JADX INFO: renamed from: a */
    public final oa00 f93327a;

    /* JADX INFO: renamed from: b */
    public final mab0 f93328b;

    /* JADX INFO: renamed from: c */
    public final c9k f93329c;

    public hnf(oa00 oa00Var, mab0 mab0Var, c9k c9kVar) {
        this.f93327a = oa00Var;
        this.f93328b = mab0Var;
        this.f93329c = c9kVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m48010a(String str, String str2, ibk ibkVar) {
        gnf gnfVar;
        String str3;
        if (ibkVar instanceof gnf) {
            gnfVar = (gnf) ibkVar;
            int i = gnfVar.f82705e;
            if ((i & Integer.MIN_VALUE) != 0) {
                gnfVar.f82705e = i - Integer.MIN_VALUE;
            } else {
                gnfVar = new gnf(this, ibkVar);
            }
        } else {
            gnfVar = new gnf(this, ibkVar);
        }
        Object objM76978s = gnfVar.f82703c;
        int i2 = gnfVar.f82705e;
        fbk fbkVar = null;
        try {
            if (i2 == 0) {
                bga.m29073P(objM76978s);
                rrd rrdVar = new rrd(this, fbkVar, 5);
                gnfVar.f82701a = str;
                gnfVar.f82702b = str2;
                gnfVar.f82705e = 1;
                objM76978s = s1h1.m76978s(5000L, rrdVar, gnfVar);
                yuk yukVar = yuk.f276404a;
                if (objM76978s == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str2 = gnfVar.f82702b;
                str = gnfVar.f82701a;
                bga.m29073P(objM76978s);
            }
            str3 = ((zgx0) objM76978s).f282732a;
        } catch (Exception e) {
            na6.m63972t("Failed to generate risk device id", e);
            str3 = "";
        }
        ma00 ma00Var = na00.Companion;
        x0h1.m89578u(this.f93329c, null, 0, new wbe(this, new la00(UUID.randomUUID().toString(), str, str2, new ia00(str3)), fbkVar, 8), 3);
        return str3;
    }
}
