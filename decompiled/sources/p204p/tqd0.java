package p204p;

import android.text.TextUtils;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public class tqd0 {

    /* JADX INFO: renamed from: a */
    public final String f222800a;

    /* JADX INFO: renamed from: b */
    public final int f222801b;

    /* JADX INFO: renamed from: c */
    public final int f222802c;

    public tqd0(String str, int i, int i2) {
        this.f222800a = str;
        this.f222801b = i;
        this.f222802c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tqd0)) {
            return false;
        }
        tqd0 tqd0Var = (tqd0) obj;
        int i = tqd0Var.f222802c;
        String str = tqd0Var.f222800a;
        int i2 = tqd0Var.f222801b;
        int i3 = this.f222802c;
        String str2 = this.f222800a;
        int i4 = this.f222801b;
        if (i4 < 0 || i2 < 0) {
            return TextUtils.equals(str2, str) && i3 == i;
        }
        return TextUtils.equals(str2, str) && i4 == i2 && i3 == i;
    }

    public final int hashCode() {
        return Objects.hash(this.f222800a, Integer.valueOf(this.f222802c));
    }
}
