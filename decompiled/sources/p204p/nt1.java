package p204p;

import android.content.DialogInterface;
import android.content.res.Configuration;
import android.content.res.Resources;

/* JADX INFO: loaded from: classes4.dex */
public final class nt1 implements DialogInterface.OnShowListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f157950a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ srk f157951b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ urk f157952c;

    public /* synthetic */ nt1(urk urkVar, srk srkVar, int i) {
        this.f157950a = i;
        this.f157952c = urkVar;
        this.f157951b = srkVar;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        Resources resources;
        Configuration configuration;
        switch (this.f157950a) {
            case 0:
                if (((ot1) this.f157952c).m49699V0().getResources().getConfiguration().orientation == 2) {
                    srk srkVar = this.f157951b;
                    srkVar.m87626g().m1578L(3);
                    srkVar.m87626g().f2008E = true;
                }
                break;
            default:
                m500 m500VarM49715n0 = ((u231) this.f157952c).m49715n0();
                if (m500VarM49715n0 != null && (resources = m500VarM49715n0.getResources()) != null && (configuration = resources.getConfiguration()) != null && configuration.orientation == 2) {
                    srk srkVar2 = this.f157951b;
                    srkVar2.m87626g().m1578L(3);
                    srkVar2.m87626g().f2008E = true;
                    break;
                }
                break;
        }
    }
}
