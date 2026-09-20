package p204p;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public final class b080 extends LinkedHashMap {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int f21797b = 0;

    /* JADX INFO: renamed from: a */
    public final int f21798a;

    public b080(int i) {
        super(10, 0.75f, true);
        this.f21798a = i;
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry entry) {
        return super.size() > this.f21798a;
    }
}
