package p204p;

import android.os.Build;
import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.TextWatcher;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class gw31 implements TextWatcher, SpanWatcher {

    /* JADX INFO: renamed from: a */
    public final Object f84904a;

    /* JADX INFO: renamed from: b */
    public final AtomicInteger f84905b = new AtomicInteger(0);

    public gw31(Object obj) {
        this.f84904a = obj;
    }

    /* JADX INFO: renamed from: a */
    public final void m45906a() {
        this.f84905b.incrementAndGet();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        ((TextWatcher) this.f84904a).afterTextChanged(editable);
    }

    /* JADX INFO: renamed from: b */
    public final void m45907b() {
        this.f84905b.decrementAndGet();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        ((TextWatcher) this.f84904a).beforeTextChanged(charSequence, i, i2, i3);
    }

    @Override // android.text.SpanWatcher
    public final void onSpanAdded(Spannable spannable, Object obj, int i, int i2) {
        if (this.f84905b.get() <= 0 || !(obj instanceof fp91)) {
            ((SpanWatcher) this.f84904a).onSpanAdded(spannable, obj, i, i2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001c A[PHI: r11
      0x001c: PHI (r11v1 int) = (r11v0 int), (r11v3 int) binds: [B:8:0x0011, B:12:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.text.SpanWatcher
    public final void onSpanChanged(Spannable spannable, Object obj, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        if (this.f84905b.get() <= 0 || !(obj instanceof fp91)) {
            if (Build.VERSION.SDK_INT >= 28) {
                i5 = i;
                i6 = i3;
            } else {
                if (i > i2) {
                    i = 0;
                }
                if (i3 > i4) {
                    i5 = i;
                    i6 = 0;
                } else {
                    i5 = i;
                    i6 = i3;
                }
            }
            ((SpanWatcher) this.f84904a).onSpanChanged(spannable, obj, i5, i2, i6, i4);
        }
    }

    @Override // android.text.SpanWatcher
    public final void onSpanRemoved(Spannable spannable, Object obj, int i, int i2) {
        if (this.f84905b.get() <= 0 || !(obj instanceof fp91)) {
            ((SpanWatcher) this.f84904a).onSpanRemoved(spannable, obj, i, i2);
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        ((TextWatcher) this.f84904a).onTextChanged(charSequence, i, i2, i3);
    }
}
