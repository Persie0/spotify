package p204p;

import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class yf40 extends o3a1 {

    /* JADX INFO: renamed from: b */
    public final o3a1 f272122b;

    /* JADX INFO: renamed from: c */
    public Object f272123c;

    /* JADX INFO: renamed from: d */
    public o3a1 f272124d;

    public yf40(sf40 sf40Var) {
        super(0);
        this.f272122b = sf40Var.f208460e.entrySet().iterator();
        this.f272123c = null;
        this.f272124d = pw50.f181916e;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f272124d.hasNext() || this.f272122b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f272124d.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f272122b.next();
            this.f272123c = entry.getKey();
            this.f272124d = ((ef40) entry.getValue()).iterator();
        }
        Object obj = this.f272123c;
        Objects.requireNonNull(obj);
        return new hf40(obj, this.f272124d.next());
    }
}
