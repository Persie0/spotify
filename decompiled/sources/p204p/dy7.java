package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class dy7 extends sy3 {

    /* JADX INFO: renamed from: a */
    public final Integer f54202a;

    /* JADX INFO: renamed from: b */
    public final String f54203b;

    /* JADX INFO: renamed from: c */
    public final String f54204c;

    /* JADX INFO: renamed from: d */
    public final String f54205d;

    /* JADX INFO: renamed from: e */
    public final String f54206e;

    /* JADX INFO: renamed from: f */
    public final String f54207f;

    /* JADX INFO: renamed from: g */
    public final String f54208g;

    /* JADX INFO: renamed from: h */
    public final String f54209h;

    /* JADX INFO: renamed from: i */
    public final String f54210i;

    /* JADX INFO: renamed from: j */
    public final String f54211j;

    /* JADX INFO: renamed from: k */
    public final String f54212k;

    /* JADX INFO: renamed from: l */
    public final String f54213l;

    public dy7(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.f54202a = num;
        this.f54203b = str;
        this.f54204c = str2;
        this.f54205d = str3;
        this.f54206e = str4;
        this.f54207f = str5;
        this.f54208g = str6;
        this.f54209h = str7;
        this.f54210i = str8;
        this.f54211j = str9;
        this.f54212k = str10;
        this.f54213l = str11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof sy3) {
            sy3 sy3Var = (sy3) obj;
            Integer num = this.f54202a;
            if (num != null ? num.equals(((dy7) sy3Var).f54202a) : ((dy7) sy3Var).f54202a == null) {
                String str = this.f54203b;
                if (str != null ? str.equals(((dy7) sy3Var).f54203b) : ((dy7) sy3Var).f54203b == null) {
                    String str2 = this.f54204c;
                    if (str2 != null ? str2.equals(((dy7) sy3Var).f54204c) : ((dy7) sy3Var).f54204c == null) {
                        String str3 = this.f54205d;
                        if (str3 != null ? str3.equals(((dy7) sy3Var).f54205d) : ((dy7) sy3Var).f54205d == null) {
                            String str4 = this.f54206e;
                            if (str4 != null ? str4.equals(((dy7) sy3Var).f54206e) : ((dy7) sy3Var).f54206e == null) {
                                String str5 = this.f54207f;
                                if (str5 != null ? str5.equals(((dy7) sy3Var).f54207f) : ((dy7) sy3Var).f54207f == null) {
                                    String str6 = this.f54208g;
                                    if (str6 != null ? str6.equals(((dy7) sy3Var).f54208g) : ((dy7) sy3Var).f54208g == null) {
                                        String str7 = this.f54209h;
                                        if (str7 != null ? str7.equals(((dy7) sy3Var).f54209h) : ((dy7) sy3Var).f54209h == null) {
                                            String str8 = this.f54210i;
                                            if (str8 != null ? str8.equals(((dy7) sy3Var).f54210i) : ((dy7) sy3Var).f54210i == null) {
                                                String str9 = this.f54211j;
                                                if (str9 != null ? str9.equals(((dy7) sy3Var).f54211j) : ((dy7) sy3Var).f54211j == null) {
                                                    String str10 = this.f54212k;
                                                    if (str10 != null ? str10.equals(((dy7) sy3Var).f54212k) : ((dy7) sy3Var).f54212k == null) {
                                                        String str11 = this.f54213l;
                                                        if (str11 != null ? str11.equals(((dy7) sy3Var).f54213l) : ((dy7) sy3Var).f54213l == null) {
                                                            return true;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Integer num = this.f54202a;
        int iHashCode = ((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003;
        String str = this.f54203b;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f54204c;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f54205d;
        int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f54206e;
        int iHashCode5 = (iHashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.f54207f;
        int iHashCode6 = (iHashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.f54208g;
        int iHashCode7 = (iHashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        String str7 = this.f54209h;
        int iHashCode8 = (iHashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
        String str8 = this.f54210i;
        int iHashCode9 = (iHashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
        String str9 = this.f54211j;
        int iHashCode10 = (iHashCode9 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
        String str10 = this.f54212k;
        int iHashCode11 = (iHashCode10 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
        String str11 = this.f54213l;
        return (str11 != null ? str11.hashCode() : 0) ^ iHashCode11;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidClientInfo{sdkVersion=");
        sb.append(this.f54202a);
        sb.append(", model=");
        sb.append(this.f54203b);
        sb.append(", hardware=");
        sb.append(this.f54204c);
        sb.append(", device=");
        sb.append(this.f54205d);
        sb.append(", product=");
        sb.append(this.f54206e);
        sb.append(", osBuild=");
        sb.append(this.f54207f);
        sb.append(", manufacturer=");
        sb.append(this.f54208g);
        sb.append(", fingerprint=");
        sb.append(this.f54209h);
        sb.append(", locale=");
        sb.append(this.f54210i);
        sb.append(", country=");
        sb.append(this.f54211j);
        sb.append(", mccMnc=");
        sb.append(this.f54212k);
        sb.append(", applicationBuild=");
        return dq60.m36616p(this.f54213l, "}", sb);
    }
}
