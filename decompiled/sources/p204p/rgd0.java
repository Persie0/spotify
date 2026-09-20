package p204p;

import android.net.Uri;
import android.os.Bundle;

/* JADX INFO: loaded from: classes8.dex */
public final class rgd0 extends qe70 implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f198934a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Uri f198935b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Bundle f198936c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rgd0(Uri uri, Bundle bundle, int i) {
        super(2);
        this.f198934a = i;
        this.f198935b = uri;
        this.f198936c = bundle;
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f198934a) {
            case 0:
                return ((xnd0) obj).mo31392b((String) obj2, this.f198935b, this.f198936c);
            default:
                return ((xnd0) obj).mo31407q((String) obj2, this.f198935b, this.f198936c);
        }
    }
}
