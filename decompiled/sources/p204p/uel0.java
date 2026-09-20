package p204p;

import android.os.Bundle;
import io.reactivex.rxjava3.functions.Consumer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public final class uel0 implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f229557a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ xel0 f229558b;

    public /* synthetic */ uel0(xel0 xel0Var, int i) {
        this.f229557a = i;
        this.f229558b = xel0Var;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.f229557a) {
            case 0:
                zel0 zel0Var = (zel0) obj;
                z9j0 z9j0Var = this.f229558b.f260735a;
                d850 d850Var = zel0Var.f282051b;
                String str = zel0Var.f282050a;
                if (d850Var == null) {
                    z9j0Var.mo47346g(str);
                } else {
                    z9j0Var.mo47342b(str, d850Var, null);
                }
                break;
            default:
                yel0 yel0Var = (yel0) obj;
                z9j0 z9j0Var2 = this.f229558b.f260735a;
                ArrayList arrayList = yel0Var.f272008a;
                String str2 = yel0Var.f272009b;
                Bundle bundle = new Bundle();
                bundle.putStringArrayList("multi_event_card_uris", new ArrayList<>(arrayList));
                if (str2 != null) {
                    bundle.putString("multi_event_card_artist_uri", str2);
                } else {
                    bundle.remove("multi_event_card_artist_uri");
                }
                d850 d850Var2 = yel0Var.f272010c;
                if (d850Var2 == null) {
                    z9j0Var2.mo47347h(kyf1.m57707l(), bundle);
                } else {
                    z9j0Var2.mo47342b(kyf1.m57707l(), d850Var2, bundle);
                }
                break;
        }
    }
}
