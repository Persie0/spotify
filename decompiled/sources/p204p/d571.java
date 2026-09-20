package p204p;

import android.view.textclassifier.TextClassification;

/* JADX INFO: loaded from: classes3.dex */
public final class d571 extends n471 {

    /* JADX INFO: renamed from: b */
    public final TextClassification f45361b;

    /* JADX INFO: renamed from: c */
    public final int f45362c;

    public d571(Object obj, TextClassification textClassification, int i) {
        super(obj);
        this.f45361b = textClassification;
        this.f45362c = i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextContextMenuRemoteActionItem(key=");
        sb.append(this.f150228a);
        sb.append(", textClassification=");
        sb.append(this.f45361b);
        sb.append(", index=");
        return edb.m38567p(sb, this.f45362c, ')');
    }
}
