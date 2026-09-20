package p204p;

import android.view.View;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: classes8.dex */
public final class yz00 implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f277653a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zz00 f277654b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Consumer f277655c;

    public /* synthetic */ yz00(zz00 zz00Var, Consumer consumer, int i) {
        this.f277653a = i;
        this.f277654b = zz00Var;
        this.f277655c = consumer;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f277653a;
        Consumer consumer = this.f277655c;
        zz00 zz00Var = this.f277654b;
        switch (i) {
            case 0:
                zz00.m97249d(zz00Var, consumer, zz00Var.f287750c, pz00.f183564a, zz00Var.f287751d, zz00Var.f287752e, zz00Var.f287753f, zz00Var.f287754g);
                break;
            case 1:
                zz00.m97249d(zz00Var, consumer, zz00Var.f287751d, rz00.f204017a, zz00Var.f287750c, zz00Var.f287752e, zz00Var.f287753f, zz00Var.f287754g);
                break;
            case 2:
                zz00.m97249d(zz00Var, consumer, zz00Var.f287752e, sz00.f215356a, zz00Var.f287750c, zz00Var.f287751d, zz00Var.f287753f, zz00Var.f287754g);
                break;
            case 3:
                zz00.m97249d(zz00Var, consumer, zz00Var.f287753f, uz00.f235397a, zz00Var.f287750c, zz00Var.f287751d, zz00Var.f287752e, zz00Var.f287754g);
                break;
            default:
                zz00.m97249d(zz00Var, consumer, zz00Var.f287754g, vz00.f246356a, zz00Var.f287750c, zz00Var.f287751d, zz00Var.f287752e, zz00Var.f287753f);
                break;
        }
    }
}
