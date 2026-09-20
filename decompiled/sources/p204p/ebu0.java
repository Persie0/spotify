package p204p;

import androidx.datastore.preferences.protobuf.AbstractC0044a;
import androidx.datastore.preferences.protobuf.AbstractC0048e;

/* JADX INFO: loaded from: classes.dex */
public final class ebu0 {

    /* JADX INFO: renamed from: a */
    public final AbstractC0044a f58146a;

    /* JADX INFO: renamed from: b */
    public final String f58147b;

    /* JADX INFO: renamed from: c */
    public final Object[] f58148c;

    /* JADX INFO: renamed from: d */
    public final int f58149d;

    public ebu0(AbstractC0048e abstractC0048e, String str, Object[] objArr) {
        this.f58146a = abstractC0048e;
        this.f58147b = str;
        this.f58148c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f58149d = cCharAt;
            return;
        }
        int i = cCharAt & 8191;
        int i2 = 13;
        int i3 = 1;
        while (true) {
            int i4 = i3 + 1;
            char cCharAt2 = str.charAt(i3);
            if (cCharAt2 < 55296) {
                this.f58149d = i | (cCharAt2 << i2);
                return;
            } else {
                i |= (cCharAt2 & 8191) << i2;
                i2 += 13;
                i3 = i4;
            }
        }
    }
}
