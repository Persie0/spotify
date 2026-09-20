package p204p;

import android.content.Context;
import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class lyo0 implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f138081a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ nyo0 f138082b;

    public /* synthetic */ lyo0(nyo0 nyo0Var, int i) {
        this.f138081a = i;
        this.f138082b = nyo0Var;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.f138081a) {
            case 0:
                jyo0 jyo0Var = (jyo0) obj;
                nyo0 nyo0Var = this.f138082b;
                Context contextM49717p0 = nyo0Var.m49717p0();
                if (jyo0Var.f117449a != 99) {
                    String str = jyo0Var.f117450b;
                    na6.m63960h(edb.m38564m("unexpected track or context uri: ", str), str.isEmpty() || str.startsWith("spotify:track:") || str.startsWith("spotify:local:") || str.startsWith("spotify:ad:") || str.startsWith("spotify:episode:") || str.startsWith("spotify:interruption:") || str.startsWith("spotify:live:") || str.startsWith("spotify:user:") || str.startsWith("spotify:album:") || str.startsWith("spotify:vdebug"));
                    if (!nyo0Var.f159867O1) {
                        nyo0Var.m65904i1(jyo0Var.f117449a, contextM49717p0, str);
                    }
                    break;
                }
                break;
            default:
                this.f138082b.f159867O1 = ((Boolean) obj).booleanValue();
                break;
        }
    }
}
