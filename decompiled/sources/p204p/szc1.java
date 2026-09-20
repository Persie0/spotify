package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class szc1 implements s5f0 {

    /* JADX INFO: renamed from: a */
    public final String f215480a;

    /* JADX INFO: renamed from: b */
    public final String f215481b;

    public szc1(String str, String str2) {
        this.f215480a = vie1.m85615D(str);
        this.f215481b = str2;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // p204p.s5f0
    /* JADX INFO: renamed from: b */
    public final void mo35404b(nhd0 nhd0Var) {
        String str = this.f215480a;
        str.getClass();
        byte b = -1;
        switch (str.hashCode()) {
            case -1935137620:
                if (str.equals("TOTALTRACKS")) {
                    b = 0;
                }
                break;
            case -215998278:
                if (str.equals("TOTALDISCS")) {
                    b = 1;
                }
                break;
            case -113312716:
                if (str.equals("TRACKNUMBER")) {
                    b = 2;
                }
                break;
            case 62359119:
                if (str.equals("ALBUM")) {
                    b = 3;
                }
                break;
            case 67703139:
                if (str.equals("GENRE")) {
                    b = 4;
                }
                break;
            case 79833656:
                if (str.equals("TITLE")) {
                    b = 5;
                }
                break;
            case 428414940:
                if (str.equals("DESCRIPTION")) {
                    b = 6;
                }
                break;
            case 905239725:
                if (str.equals("DISCSUBTITLE")) {
                    b = 7;
                }
                break;
            case 993300766:
                if (str.equals("DISCNUMBER")) {
                    b = 8;
                }
                break;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    b = 9;
                }
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    b = 10;
                }
                break;
        }
        String str2 = this.f215481b;
        switch (b) {
            case 0:
                Integer numM54981P = k0e1.m54981P(str2);
                if (numM54981P != null) {
                    nhd0Var.f153979p = numM54981P;
                }
                break;
            case 1:
                Integer numM54981P2 = k0e1.m54981P(str2);
                if (numM54981P2 != null) {
                    nhd0Var.f153957E = numM54981P2;
                }
                break;
            case 2:
                Integer numM54981P3 = k0e1.m54981P(str2);
                if (numM54981P3 != null) {
                    nhd0Var.f153978o = numM54981P3;
                }
                break;
            case 3:
                nhd0Var.f153966c = str2;
                break;
            case 4:
                nhd0Var.f153958F = str2;
                break;
            case 5:
                nhd0Var.f153964a = str2;
                break;
            case 6:
                nhd0Var.f153970g = str2;
                break;
            case 7:
                nhd0Var.f153955C = str2;
                break;
            case 8:
                Integer numM54981P4 = k0e1.m54981P(str2);
                if (numM54981P4 != null) {
                    nhd0Var.f153956D = numM54981P4;
                }
                break;
            case 9:
                nhd0Var.f153967d = str2;
                break;
            case 10:
                nhd0Var.f153965b = str2;
                break;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && szc1.class == obj.getClass()) {
            szc1 szc1Var = (szc1) obj;
            if (this.f215480a.equals(szc1Var.f215480a) && this.f215481b.equals(szc1Var.f215481b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f215481b.hashCode() + s571.m77243b(527, 31, this.f215480a);
    }

    public final String toString() {
        return "VC: " + this.f215480a + "=" + this.f215481b;
    }
}
