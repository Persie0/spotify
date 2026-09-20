package p204p;

import java.text.Collator;
import java.util.Comparator;

/* JADX INFO: loaded from: classes7.dex */
public final class z320 implements Comparator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f278744a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Collator f278745b;

    public /* synthetic */ z320(Collator collator, int i) {
        this.f278744a = i;
        this.f278745b = collator;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f278744a) {
            case 0:
                return this.f278745b.compare(((u320) obj).f226260f, ((u320) obj2).f226260f);
            default:
                return this.f278745b.compare(((tf70) obj).f219875b, ((tf70) obj2).f219875b);
        }
    }
}
