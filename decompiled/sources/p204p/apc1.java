package p204p;

import android.util.Property;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class apc1 extends Property {
    @Override // android.util.Property
    public final Object get(Object obj) {
        return Float.valueOf(bpc1.f29411a.mo39655F((View) obj));
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        float fFloatValue = ((Float) obj2).floatValue();
        bpc1.f29411a.mo39656X((View) obj, fFloatValue);
    }
}
