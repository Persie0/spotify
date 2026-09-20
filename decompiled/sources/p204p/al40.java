package p204p;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class al40 extends LinkedHashMap {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f16769a;

    /* JADX INFO: renamed from: b */
    public final int f16770b;

    public /* synthetic */ al40(int i, boolean z) {
        this.f16769a = i;
        this.f16770b = 10;
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry entry) {
        switch (this.f16769a) {
            case 0:
                return super.size() > this.f16770b;
            case 1:
                return super.size() > this.f16770b;
            case 2:
                return super.size() > this.f16770b;
            default:
                return super.size() > this.f16770b;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public al40(int i) {
        super(1000, 0.75f, true);
        this.f16769a = i;
        switch (i) {
            case 3:
                super(1001, 1.0f, true);
                this.f16770b = 1000;
                break;
            default:
                this.f16770b = 1000;
                break;
        }
    }
}
