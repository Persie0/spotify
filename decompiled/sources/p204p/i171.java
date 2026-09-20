package p204p;

import android.text.Layout;

/* JADX INFO: loaded from: classes.dex */
public abstract class i171 {

    /* JADX INFO: renamed from: a */
    public static final Layout.Alignment f97434a;

    /* JADX INFO: renamed from: b */
    public static final Layout.Alignment f97435b;

    static {
        Layout.Alignment[] alignmentArrValues = Layout.Alignment.values();
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        Layout.Alignment alignment2 = alignment;
        for (Layout.Alignment alignment3 : alignmentArrValues) {
            if (wj50.m88271j(alignment3.name(), "ALIGN_LEFT")) {
                alignment = alignment3;
            } else if (wj50.m88271j(alignment3.name(), "ALIGN_RIGHT")) {
                alignment2 = alignment3;
            }
        }
        f97434a = alignment;
        f97435b = alignment2;
    }
}
