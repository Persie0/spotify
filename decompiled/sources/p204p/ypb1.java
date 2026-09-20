package p204p;

import android.view.View;

/* JADX INFO: loaded from: classes11.dex */
public final class ypb1 implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f274893a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ aqb1 f274894b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f274895c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f274896d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ psj f274897e;

    public /* synthetic */ ypb1(aqb1 aqb1Var, String str, String str2, psj psjVar, int i) {
        this.f274893a = i;
        this.f274894b = aqb1Var;
        this.f274895c = str;
        this.f274896d = str2;
        this.f274897e = psjVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f274893a) {
            case 0:
                this.f274894b.f18180d.invoke(new gpb1(this.f274895c, this.f274896d, this.f274897e));
                break;
            case 1:
                this.f274894b.f18180d.invoke(new gpb1(this.f274895c, this.f274896d, this.f274897e));
                break;
            default:
                this.f274894b.f18180d.invoke(new gpb1(this.f274895c, this.f274896d, this.f274897e));
                break;
        }
    }
}
