package p204p;

import android.view.View;

/* JADX INFO: loaded from: classes11.dex */
public final class zpb1 implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ aqb1 f285090a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f285091b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f285092c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ boolean f285093d;

    public zpb1(aqb1 aqb1Var, String str, boolean z, boolean z2) {
        this.f285090a = aqb1Var;
        this.f285091b = str;
        this.f285092c = z;
        this.f285093d = z2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f285090a.f18180d.invoke(new hpb1(this.f285091b, this.f285092c, this.f285093d));
    }
}
