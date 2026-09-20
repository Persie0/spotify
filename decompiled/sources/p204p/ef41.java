package p204p;

import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class ef41 {

    /* JADX INFO: renamed from: h */
    public static final Pattern f58935h;

    /* JADX INFO: renamed from: i */
    public static final Pattern f58936i;

    /* JADX INFO: renamed from: j */
    public static final Pattern f58937j;

    /* JADX INFO: renamed from: k */
    public static final Pattern f58938k;

    /* JADX INFO: renamed from: a */
    public final String f58939a;

    /* JADX INFO: renamed from: b */
    public final gn80 f58940b;

    /* JADX INFO: renamed from: c */
    public final List f58941c;

    /* JADX INFO: renamed from: d */
    public final String f58942d;

    /* JADX INFO: renamed from: e */
    public final boolean f58943e;

    /* JADX INFO: renamed from: f */
    public final String f58944f;

    /* JADX INFO: renamed from: g */
    public final String f58945g;

    static {
        Pattern.compile("\\=|\\&");
        f58935h = Pattern.compile(":");
        f58936i = Pattern.compile("\\?");
        f58937j = Pattern.compile("#");
        f58938k = Pattern.compile("/");
    }

    public ef41(String str, gn80 gn80Var, List list, String str2, boolean z, int i) {
        list = (i & 4) != 0 ? lau.f131415a : list;
        String str3 = (i & 128) != 0 ? null : "";
        String str4 = (i & 256) != 0 ? null : "";
        this.f58939a = str;
        this.f58940b = gn80Var;
        this.f58941c = list;
        this.f58942d = str2;
        this.f58943e = z;
        this.f58944f = str3;
        this.f58945g = str4;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("mLinkName = ");
        sb.append(this.f58939a);
        sb.append(", pattern = ");
        sb.append(this.f58941c);
        sb.append(", verifier = ");
        sb.append(this.f58942d);
        sb.append(", mLinkType = ");
        sb.append(this.f58940b);
        sb.append(", mParentLinkType = null, mIsPublic = ");
        sb.append(this.f58943e);
        sb.append(", mOwner = ");
        sb.append(this.f58944f);
        sb.append(", mDescription = ");
        sb.append(this.f58945g);
        sb.append(", mExamples = ");
        lau lauVar = lau.f131415a;
        sb.append(lauVar);
        sb.append(", mCounterExamples = ");
        sb.append(lauVar);
        return sb.toString();
    }
}
