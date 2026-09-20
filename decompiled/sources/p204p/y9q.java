package p204p;

import android.view.View;
import java.util.Collection;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class y9q extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f270631a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Collection f270632b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y9q(int i, Collection collection) {
        super(1);
        this.f270631a = i;
        this.f270632b = collection;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        int i = this.f270631a;
        Collection collection = this.f270632b;
        switch (i) {
            case 0:
                View view = (View) ((Map.Entry) obj).getValue();
                WeakHashMap weakHashMap = mec1.f142677a;
                return Boolean.valueOf(g6f.m43725i0(collection, cec1.m32542f(view)));
            default:
                return Boolean.valueOf(collection.contains(obj));
        }
    }
}
