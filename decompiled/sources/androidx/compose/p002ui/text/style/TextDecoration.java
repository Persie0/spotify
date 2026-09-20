package androidx.compose.p002ui.text.style;

import java.util.ArrayList;
import p204p.dq60;
import p204p.q690;

/* JADX INFO: loaded from: classes.dex */
public final class TextDecoration {

    /* JADX INFO: renamed from: b */
    public static final TextDecoration f538b = new TextDecoration(0);

    /* JADX INFO: renamed from: c */
    public static final TextDecoration f539c = new TextDecoration(1);

    /* JADX INFO: renamed from: d */
    public static final TextDecoration f540d = new TextDecoration(2);

    /* JADX INFO: renamed from: a */
    public final int f541a;

    public TextDecoration(int i) {
        this.f541a = i;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m305a(TextDecoration textDecoration) {
        int i = textDecoration.f541a;
        int i2 = this.f541a;
        return (i | i2) == i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TextDecoration) {
            return this.f541a == ((TextDecoration) obj).f541a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f541a;
    }

    public final String toString() {
        int i = this.f541a;
        if (i == 0) {
            return "TextDecoration.None";
        }
        ArrayList arrayList = new ArrayList();
        if ((i & 1) != 0) {
            arrayList.add("Underline");
        }
        if ((i & 2) != 0) {
            arrayList.add("LineThrough");
        }
        if (arrayList.size() != 1) {
            return dq60.m36617q(new StringBuilder("TextDecoration["), q690.m72221b(arrayList, ", ", null, 62), ']');
        }
        return "TextDecoration." + ((String) arrayList.get(0));
    }
}
