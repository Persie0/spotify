package p204p;

import com.google.android.recaptcha.internal.zzhg;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class rig1 implements tjg1 {

    /* JADX INFO: renamed from: b */
    public zzhg f199541b;

    /* JADX INFO: renamed from: c */
    public gef1 f199542c;

    /* JADX INFO: renamed from: e */
    public final be41 f199544e;

    /* JADX INFO: renamed from: f */
    public final okj0 f199545f;

    /* JADX INFO: renamed from: a */
    public guf f199540a = mlg1.m62210c();

    /* JADX INFO: renamed from: d */
    public pjg1 f199543d = pjg1.f178245a;

    public rig1(okj0 okj0Var, be41 be41Var) {
        this.f199545f = okj0Var;
        this.f199544e = be41Var;
    }

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ boolean m75587c(Exception exc) {
        if (!(exc instanceof zzhg)) {
            return true;
        }
        zzhg zzhgVar = (zzhg) exc;
        return (wj50.m88271j(zzhgVar.m1670a(), zz11.f287829f2) || wj50.m88271j(zzhgVar.m1670a(), zz11.f287832g2) || wj50.m88271j(zzhgVar.m1670a(), zz11.f287835h2)) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public static final Object m75588d(rig1 rig1Var, phg1 phg1Var, ibk ibkVar) {
        khg1 khg1Var;
        jhc1 jhc1Var;
        if (ibkVar instanceof khg1) {
            khg1Var = (khg1) ibkVar;
            int i = khg1Var.f122655c;
            if ((i & Integer.MIN_VALUE) != 0) {
                khg1Var.f122655c = i - Integer.MIN_VALUE;
            } else {
                khg1Var = new khg1(rig1Var, ibkVar);
            }
        } else {
            khg1Var = new khg1(rig1Var, ibkVar);
        }
        Object obj = khg1Var.f122653a;
        int i2 = khg1Var.f122655c;
        if (i2 == 0) {
            bga.m29073P(obj);
            jhc1 jhc1Var2 = new jhc1();
            khg1Var.f122656d = jhc1Var2;
            khg1Var.f122655c = 1;
            Object objInvoke = phg1Var.invoke(khg1Var);
            Object obj2 = yuk.f276404a;
            if (objInvoke == obj2) {
                return obj2;
            }
            jhc1Var = jhc1Var2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jhc1Var = khg1Var.f122656d;
            bga.m29073P(obj);
        }
        jhc1Var.m53384i();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        return qyg1.m74181K(jhc1Var.m53383h());
    }

    @Override // p204p.tjg1
    /* JADX INFO: renamed from: a */
    public final cog1 mo26158a(long j, ogg1 ogg1Var) {
        return new cog1(new nig1(j, null, this));
    }

    @Override // p204p.tjg1
    /* JADX INFO: renamed from: b */
    public final cog1 mo26159b(String str, hyu0 hyu0Var, long j) {
        return new cog1(new q43(this, j, str, hyu0Var, (fbk) null));
    }
}
