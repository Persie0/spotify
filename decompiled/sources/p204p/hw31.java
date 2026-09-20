package p204p;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class hw31 extends SpannableStringBuilder {

    /* JADX INFO: renamed from: a */
    public final Class f95853a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f95854b;

    public hw31(Class cls, CharSequence charSequence) {
        super(charSequence);
        this.f95854b = new ArrayList();
        wj50.m88280q(cls, "watcherClass cannot be null");
        this.f95853a = cls;
    }

    /* JADX INFO: renamed from: a */
    public final void m48908a() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f95854b;
            if (i >= arrayList.size()) {
                return;
            }
            ((gw31) arrayList.get(i)).m45906a();
            i++;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final void m48909b() {
        m48912e();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f95854b;
            if (i >= arrayList.size()) {
                return;
            }
            ((gw31) arrayList.get(i)).onTextChanged(this, 0, length(), length());
            i++;
        }
    }

    /* JADX INFO: renamed from: c */
    public final gw31 m48910c(Object obj) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f95854b;
            if (i >= arrayList.size()) {
                return null;
            }
            gw31 gw31Var = (gw31) arrayList.get(i);
            if (gw31Var.f84904a == obj) {
                return gw31Var;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m48911d(Object obj) {
        if (obj != null) {
            return this.f95853a == obj.getClass();
        }
        return false;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable delete(int i, int i2) {
        super.delete(i, i2);
        return this;
    }

    /* JADX INFO: renamed from: e */
    public final void m48912e() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f95854b;
            if (i >= arrayList.size()) {
                return;
            }
            ((gw31) arrayList.get(i)).m45907b();
            i++;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanEnd(Object obj) {
        gw31 gw31VarM48910c;
        if (m48911d(obj) && (gw31VarM48910c = m48910c(obj)) != null) {
            obj = gw31VarM48910c;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanFlags(Object obj) {
        gw31 gw31VarM48910c;
        if (m48911d(obj) && (gw31VarM48910c = m48910c(obj)) != null) {
            obj = gw31VarM48910c;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanStart(Object obj) {
        gw31 gw31VarM48910c;
        if (m48911d(obj) && (gw31VarM48910c = m48910c(obj)) != null) {
            obj = gw31VarM48910c;
        }
        return super.getSpanStart(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final Object[] getSpans(int i, int i2, Class cls) {
        if (this.f95853a != cls) {
            return super.getSpans(i, i2, cls);
        }
        gw31[] gw31VarArr = (gw31[]) super.getSpans(i, i2, gw31.class);
        Object[] objArr = (Object[]) Array.newInstance((Class<?>) cls, gw31VarArr.length);
        for (int i3 = 0; i3 < gw31VarArr.length; i3++) {
            objArr[i3] = gw31VarArr[i3].f84904a;
        }
        return objArr;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i, CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int nextSpanTransition(int i, int i2, Class cls) {
        if (cls == null || this.f95853a == cls) {
            cls = gw31.class;
        }
        return super.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void removeSpan(Object obj) {
        gw31 gw31VarM48910c;
        if (m48911d(obj)) {
            gw31VarM48910c = m48910c(obj);
            if (gw31VarM48910c != null) {
                obj = gw31VarM48910c;
            }
        } else {
            gw31VarM48910c = null;
        }
        super.removeSpan(obj);
        if (gw31VarM48910c != null) {
            this.f95854b.remove(gw31VarM48910c);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i, int i2, CharSequence charSequence) {
        replace(i, i2, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(Object obj, int i, int i2, int i3) {
        if (m48911d(obj)) {
            gw31 gw31Var = new gw31(obj);
            this.f95854b.add(gw31Var);
            obj = gw31Var;
        }
        super.setSpan(obj, i, i2, i3);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return new hw31(this.f95853a, this, i, i2);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder delete(int i, int i2) {
        super.delete(i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i, CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        replace(i, i2, charSequence, i3, i4);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i, CharSequence charSequence, int i2, int i3) {
        super.insert(i, charSequence, i2, i3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i, int i2, CharSequence charSequence) {
        m48908a();
        super.replace(i, i2, charSequence);
        m48912e();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(char c) {
        super.append(c);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i, CharSequence charSequence, int i2, int i3) {
        super.insert(i, charSequence, i2, i3);
        return this;
    }

    public hw31(Class cls, hw31 hw31Var, int i, int i2) {
        super(hw31Var, i, i2);
        this.f95854b = new ArrayList();
        wj50.m88280q(cls, "watcherClass cannot be null");
        this.f95853a = cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(char c) {
        super.append(c);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(char c) {
        super.append(c);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        m48908a();
        super.replace(i, i2, charSequence, i3, i4);
        m48912e();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    public final SpannableStringBuilder append(CharSequence charSequence, Object obj, int i) {
        super.append(charSequence, obj, i);
        return this;
    }
}
