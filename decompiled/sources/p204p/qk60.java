package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class qk60 {

    /* JADX INFO: renamed from: a */
    public final boolean f189464a;

    /* JADX INFO: renamed from: b */
    public final boolean f189465b;

    /* JADX INFO: renamed from: c */
    public final boolean f189466c;

    /* JADX INFO: renamed from: d */
    public final boolean f189467d;

    /* JADX INFO: renamed from: e */
    public final boolean f189468e;

    /* JADX INFO: renamed from: f */
    public final boolean f189469f;

    /* JADX INFO: renamed from: g */
    public final String f189470g;

    /* JADX INFO: renamed from: h */
    public final boolean f189471h;

    /* JADX INFO: renamed from: i */
    public final String f189472i;

    /* JADX INFO: renamed from: j */
    public final boolean f189473j;

    /* JADX INFO: renamed from: k */
    public final boolean f189474k;

    /* JADX INFO: renamed from: l */
    public final int f189475l;

    /* JADX INFO: renamed from: m */
    public final boolean f189476m;

    public qk60(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, String str, boolean z7, String str2, boolean z8, boolean z9, int i, boolean z10) {
        this.f189464a = z;
        this.f189465b = z2;
        this.f189466c = z3;
        this.f189467d = z4;
        this.f189468e = z5;
        this.f189469f = z6;
        this.f189470g = str;
        this.f189471h = z7;
        this.f189472i = str2;
        this.f189473j = z8;
        this.f189474k = z9;
        this.f189475l = i;
        this.f189476m = z10;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JsonConfiguration(encodeDefaults=");
        sb.append(this.f189464a);
        sb.append(", ignoreUnknownKeys=");
        sb.append(this.f189465b);
        sb.append(", isLenient=");
        sb.append(this.f189466c);
        sb.append(", allowStructuredMapKeys=");
        sb.append(this.f189467d);
        sb.append(", prettyPrint=");
        sb.append(this.f189468e);
        sb.append(", explicitNulls=");
        sb.append(this.f189469f);
        sb.append(", prettyPrintIndent='");
        sb.append(this.f189470g);
        sb.append("', coerceInputValues=");
        sb.append(this.f189471h);
        sb.append(", useArrayPolymorphism=false, classDiscriminator='");
        sb.append(this.f189472i);
        sb.append("', allowSpecialFloatingPointValues=");
        sb.append(this.f189473j);
        sb.append(", useAlternativeNames=");
        sb.append(this.f189474k);
        sb.append(", namingStrategy=null, decodeEnumsCaseInsensitive=false, allowTrailingComma=false, allowComments=false, classDiscriminatorMode=");
        sb.append(tfe.m80663u(this.f189475l));
        sb.append(", exceptionsWithDebugInfo=");
        return s571.m77253l(sb, this.f189476m, ')');
    }
}
