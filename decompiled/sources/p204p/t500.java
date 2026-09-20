package p204p;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

/* JADX INFO: loaded from: classes8.dex */
public final class t500 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f217185a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ v500 f217186b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Intent f217187c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t500(v500 v500Var, Intent intent, int i) {
        super(1);
        this.f217185a = i;
        this.f217186b = v500Var;
        this.f217187c = intent;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        String string;
        switch (this.f217185a) {
            case 0:
                this.f217186b.f237276b.mo40791a(((t1j0) obj).f216286a, this.f217187c, uzq0.f235620a);
                return jcf.f111110a;
            case 1:
                Intent intent = new Intent("android.intent.action.VIEW");
                Intent intent2 = this.f217187c;
                intent.setComponent(intent2.getComponent());
                String strM35698E = ((r1j0) obj).f194871a.m35698E();
                intent.setData(strM35698E != null ? Uri.parse(strM35698E) : null);
                intent.putExtra("is_internal_navigation", true);
                String stringExtra = intent2.getStringExtra("navigation_transaction_id");
                if (stringExtra != null) {
                    intent.putExtra("navigation_transaction_id", stringExtra);
                }
                this.f217186b.f237277c.accept(intent);
                return jcf.f111110a;
            case 2:
                return this.f217186b.m84670a((s1j0) obj, this.f217187c, uzq0.f235620a);
            default:
                u1j0 u1j0Var = (u1j0) obj;
                Bundle bundle = new Bundle();
                bundle.putString("page_key", u1j0Var.f225847a.getName());
                bundle.putParcelable("parameters", u1j0Var.f225848b);
                Intent intent3 = this.f217187c;
                Bundle extras = intent3.getExtras();
                if (extras != null && (string = extras.getString("result-receiver-id")) != null) {
                    bundle.putString("result-receiver-id", string);
                }
                return this.f217186b.m84670a(new s1j0(bundle, yam0.class), intent3, u1j0Var.f225849c);
        }
    }
}
