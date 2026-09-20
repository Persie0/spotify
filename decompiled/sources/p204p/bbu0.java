package p204p;

import androidx.glance.appwidget.protobuf.AbstractC0055a;
import androidx.glance.appwidget.protobuf.AbstractC0059e;

/* JADX INFO: loaded from: classes3.dex */
public final class bbu0 {

    /* JADX INFO: renamed from: a */
    public final AbstractC0055a f25658a;

    /* JADX INFO: renamed from: b */
    public final String f25659b;

    /* JADX INFO: renamed from: c */
    public final Object[] f25660c;

    /* JADX INFO: renamed from: d */
    public final int f25661d;

    public bbu0(AbstractC0059e abstractC0059e, String str, Object[] objArr) {
        this.f25658a = abstractC0059e;
        this.f25659b = str;
        this.f25660c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f25661d = cCharAt;
            return;
        }
        int i = cCharAt & 8191;
        int i2 = 13;
        int i3 = 1;
        while (true) {
            int i4 = i3 + 1;
            char cCharAt2 = str.charAt(i3);
            if (cCharAt2 < 55296) {
                this.f25661d = i | (cCharAt2 << i2);
                return;
            } else {
                i |= (cCharAt2 & 8191) << i2;
                i2 += 13;
                i3 = i4;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m28647a() {
        int i = this.f25661d;
        if ((i & 1) != 0) {
            return 1;
        }
        return (i & 4) == 4 ? 3 : 2;
    }
}
