package p204p;

import android.text.Editable;

/* JADX INFO: loaded from: classes3.dex */
public final class v7u extends Editable.Factory {

    /* JADX INFO: renamed from: a */
    public static final Object f238314a = new Object();

    /* JADX INFO: renamed from: b */
    public static volatile v7u f238315b;

    /* JADX INFO: renamed from: c */
    public static Class f238316c;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = f238316c;
        return cls != null ? new hw31(cls, charSequence) : super.newEditable(charSequence);
    }
}
