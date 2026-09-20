package p204p;

import android.app.Activity;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class lsf1 extends zyf1 {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f136535e = 1;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f136536f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Object f136537g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lsf1(n0g1 n0g1Var, Activity activity) {
        super(n0g1Var.f149054a, true);
        this.f136536f = activity;
        this.f136537g = n0g1Var;
    }

    @Override // p204p.zyf1
    /* JADX INFO: renamed from: a */
    public final void mo42856a() {
        switch (this.f136535e) {
            case 0:
                rpf1 rpf1Var = ((s0g1) this.f136537g).f204388f;
                ig31.m50506x(rpf1Var);
                imk0 imk0Var = new imk0(this.f136536f);
                long j = this.f287580a;
                ipf1 ipf1Var = (ipf1) rpf1Var;
                Parcel parcelM51260C = ipf1Var.m51260C();
                parcelM51260C.writeString("fcm");
                parcelM51260C.writeString("_ln");
                pkf1.m70214b(parcelM51260C, imk0Var);
                parcelM51260C.writeInt(1);
                parcelM51260C.writeLong(j);
                ipf1Var.m51261v1(4, parcelM51260C);
                break;
            default:
                rpf1 rpf1Var2 = ((n0g1) this.f136537g).f149054a.f204388f;
                ig31.m50506x(rpf1Var2);
                hsf1 hsf1VarM48426k = hsf1.m48426k((Activity) this.f136536f);
                long j2 = this.f287581b;
                ipf1 ipf1Var2 = (ipf1) rpf1Var2;
                Parcel parcelM51260C2 = ipf1Var2.m51260C();
                pkf1.m70213a(parcelM51260C2, hsf1VarM48426k);
                parcelM51260C2.writeLong(j2);
                ipf1Var2.m51261v1(51, parcelM51260C2);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lsf1(s0g1 s0g1Var, String str) {
        super(s0g1Var, true);
        this.f136536f = str;
        this.f136537g = s0g1Var;
    }
}
