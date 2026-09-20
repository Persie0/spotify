package p204p;

import android.os.Bundle;

/* JADX INFO: loaded from: classes6.dex */
public final class duo extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f53242a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Bundle f53243b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ duo(int i, Bundle bundle) {
        super(1);
        this.f53242a = i;
        this.f53243b = bundle;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f53242a) {
            case 0:
                String str = (String) obj;
                return str + ": " + this.f53243b.get(str);
            case 1:
                return Boolean.valueOf(!this.f53243b.containsKey((String) obj));
            default:
                return Boolean.valueOf(!this.f53243b.containsKey((String) obj));
        }
    }
}
