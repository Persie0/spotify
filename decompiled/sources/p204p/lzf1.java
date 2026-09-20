package p204p;

import android.app.Activity;
import android.os.Bundle;
import android.os.Parcel;

/* JADX INFO: loaded from: classes4.dex */
public final class lzf1 extends zyf1 {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f138360e = 1;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Activity f138361f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ n0g1 f138362g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f138363h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lzf1(n0g1 n0g1Var, Activity activity, apf1 apf1Var) {
        super(n0g1Var.f149054a, true);
        this.f138361f = activity;
        this.f138363h = apf1Var;
        this.f138362g = n0g1Var;
    }

    @Override // p204p.zyf1
    /* JADX INFO: renamed from: a */
    public final void mo42856a() {
        Bundle bundle;
        switch (this.f138360e) {
            case 0:
                Bundle bundle2 = (Bundle) this.f138363h;
                if (bundle2 != null) {
                    bundle = new Bundle();
                    if (bundle2.containsKey("com.google.app_measurement.screen_service")) {
                        Object obj = bundle2.get("com.google.app_measurement.screen_service");
                        if (obj instanceof Bundle) {
                            bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                        }
                    }
                } else {
                    bundle = null;
                }
                rpf1 rpf1Var = this.f138362g.f149054a.f204388f;
                ig31.m50506x(rpf1Var);
                Activity activity = this.f138361f;
                long j = this.f287581b;
                hsf1 hsf1VarM48426k = hsf1.m48426k(activity);
                ipf1 ipf1Var = (ipf1) rpf1Var;
                Parcel parcelM51260C = ipf1Var.m51260C();
                pkf1.m70213a(parcelM51260C, hsf1VarM48426k);
                pkf1.m70213a(parcelM51260C, bundle);
                parcelM51260C.writeLong(j);
                ipf1Var.m51261v1(53, parcelM51260C);
                break;
            default:
                rpf1 rpf1Var2 = this.f138362g.f149054a.f204388f;
                ig31.m50506x(rpf1Var2);
                hsf1 hsf1VarM48426k2 = hsf1.m48426k(this.f138361f);
                apf1 apf1Var = (apf1) this.f138363h;
                long j2 = this.f287581b;
                ipf1 ipf1Var2 = (ipf1) rpf1Var2;
                Parcel parcelM51260C2 = ipf1Var2.m51260C();
                pkf1.m70213a(parcelM51260C2, hsf1VarM48426k2);
                pkf1.m70214b(parcelM51260C2, apf1Var);
                parcelM51260C2.writeLong(j2);
                ipf1Var2.m51261v1(57, parcelM51260C2);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lzf1(n0g1 n0g1Var, Bundle bundle, Activity activity) {
        super(n0g1Var.f149054a, true);
        this.f138363h = bundle;
        this.f138361f = activity;
        this.f138362g = n0g1Var;
    }
}
