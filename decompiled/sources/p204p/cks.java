package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class cks implements Comparable {

    /* JADX INFO: renamed from: b */
    public static final hvi0 f39079b = new hvi0(25);

    /* JADX INFO: renamed from: c */
    public static final long f39080c = jwg1.m54466p(4611686018427387903L);

    /* JADX INFO: renamed from: d */
    public static final long f39081d = jwg1.m54466p(-4611686018427387903L);

    /* JADX INFO: renamed from: e */
    public static final long f39082e = 9223372036854759646L;

    /* JADX INFO: renamed from: a */
    public final long f39083a;

    public /* synthetic */ cks(long j) {
        this.f39083a = j;
    }

    /* JADX INFO: renamed from: a */
    public static final long m33182a(long j, long j2) {
        long jM54463m = jwg1.m54463m(j2);
        long jM54464n = jwg1.m54464n(j, jM54463m);
        if (-4611686018426L > jM54464n || jM54464n >= 4611686018427L) {
            return jwg1.m54466p(jM54464n);
        }
        return jwg1.m54468r(jwg1.m54462l(jM54464n) + (j2 - jwg1.m54462l(jM54463m)));
    }

    /* JADX INFO: renamed from: b */
    public static final void m33183b(StringBuilder sb, int i, int i2, int i3, String str, boolean z) {
        sb.append(i);
        if (i2 != 0) {
            sb.append('.');
            String strM88467Q0 = wl51.m88467Q0(i3, String.valueOf(i2));
            int i4 = -1;
            int length = strM88467Q0.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i5 = length - 1;
                    if (strM88467Q0.charAt(length) != '0') {
                        i4 = length;
                        break;
                    } else if (i5 < 0) {
                        break;
                    } else {
                        length = i5;
                    }
                }
            }
            int i6 = i4 + 1;
            if (z || i6 >= 3) {
                sb.append((CharSequence) strM88467Q0, 0, ((i4 + 3) / 3) * 3);
            } else {
                sb.append((CharSequence) strM88467Q0, 0, i6);
            }
        }
        sb.append(str);
    }

    /* JADX INFO: renamed from: c */
    public static int m33184c(long j, long j2) {
        long j3 = j ^ j2;
        if (j3 < 0 || (((int) j3) & 1) == 0) {
            return wj50.m88283v(j, j2);
        }
        int i = (((int) j) & 1) - (((int) j2) & 1);
        return j < 0 ? -i : i;
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m33185d(long j, long j2) {
        return j == j2;
    }

    /* JADX INFO: renamed from: e */
    public static final int m33186e(long j) {
        if (m33192k(j)) {
            return 0;
        }
        return (int) (m33199r(j, ils.HOURS) % ((long) 24));
    }

    /* JADX INFO: renamed from: f */
    public static final long m33187f(long j) {
        return ((((int) j) & 1) != 1 || m33192k(j)) ? m33199r(j, ils.MILLISECONDS) : j >> 1;
    }

    /* JADX INFO: renamed from: g */
    public static final long m33188g(long j) {
        long j2 = j >> 1;
        if ((((int) j) & 1) == 0) {
            return j2;
        }
        if (j2 > 9223372036854L) {
            return Long.MAX_VALUE;
        }
        if (j2 < -9223372036854L) {
            return Long.MIN_VALUE;
        }
        return jwg1.m54462l(j2);
    }

    /* JADX INFO: renamed from: h */
    public static final int m33189h(long j) {
        if (m33192k(j)) {
            return 0;
        }
        return (int) (m33199r(j, ils.MINUTES) % ((long) 60));
    }

    /* JADX INFO: renamed from: i */
    public static final int m33190i(long j) {
        if (m33192k(j)) {
            return 0;
        }
        return (int) ((((int) j) & 1) == 1 ? jwg1.m54462l((j >> 1) % ((long) 1000)) : (j >> 1) % ((long) 1000000000));
    }

    /* JADX INFO: renamed from: j */
    public static final int m33191j(long j) {
        if (m33192k(j)) {
            return 0;
        }
        return (int) (m33199r(j, ils.SECONDS) % ((long) 60));
    }

    /* JADX INFO: renamed from: k */
    public static final boolean m33192k(long j) {
        return j == f39080c || j == f39081d;
    }

    /* JADX INFO: renamed from: l */
    public static final boolean m33193l(long j) {
        return j > 0;
    }

    /* JADX INFO: renamed from: m */
    public static final long m33194m(long j, long j2) {
        return m33195n(j, m33201t(j2));
    }

    /* JADX INFO: renamed from: n */
    public static final long m33195n(long j, long j2) {
        int i = ((int) j) & 1;
        if (i != (((int) j2) & 1)) {
            return i == 1 ? m33182a(j >> 1, j2 >> 1) : m33182a(j2 >> 1, j >> 1);
        }
        if (i == 0) {
            return jwg1.m54460j((j >> 1) + (j2 >> 1));
        }
        long jM54464n = jwg1.m54464n(j >> 1, j2 >> 1);
        if (jM54464n != 9223372036854759646L) {
            return (jM54464n == 4611686018427387903L || jM54464n == -4611686018427387903L) ? jwg1.m54466p(jM54464n) : jwg1.m54467q(jM54464n);
        }
        throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x008b, code lost:
    
        if ((java.lang.Integer.signum(r18) * java.lang.Long.signum(r6)) > 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ab, code lost:
    
        if ((java.lang.Integer.signum(r18) * java.lang.Long.signum(r6)) > 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00af, code lost:
    
        return p204p.cks.f39080c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b2, code lost:
    
        return p204p.cks.f39081d;
     */
    /* JADX INFO: renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long m33196o(int i, long j) {
        if (m33192k(j)) {
            if (i != 0) {
                return i > 0 ? j : m33201t(j);
            }
            throw new IllegalArgumentException("Multiplying infinite duration by zero yields an undefined result.");
        }
        if (i == 0) {
            return 0L;
        }
        long j2 = j >> 1;
        long j3 = i;
        long j4 = j2 * j3;
        if ((((int) j) & 1) == 0) {
            if (-2147483647L <= j2 && j2 < 2147483648L) {
                return jwg1.m54468r(j4);
            }
            if (j4 / j3 == j2) {
                return jwg1.m54460j(j4);
            }
            long jM54463m = jwg1.m54463m(j2);
            long j5 = jM54463m * j3;
            long jM54463m2 = jwg1.m54463m((j2 - jwg1.m54462l(jM54463m)) * j3) + j5;
            if (j5 / j3 == jM54463m && (jM54463m2 ^ j5) >= 0) {
                return jwg1.m54466p(n0e1.m63440q(jM54463m2, new t2b0(-4611686018427387903L, 4611686018427387903L)));
            }
        } else if (j4 / j3 == j2) {
            return jwg1.m54466p(n0e1.m63440q(j4, new t2b0(-4611686018427387903L, 4611686018427387903L)));
        }
    }

    /* JADX INFO: renamed from: p */
    public static final double m33197p(long j, ils ilsVar) {
        if (j == f39080c) {
            return Double.POSITIVE_INFINITY;
        }
        if (j == f39081d) {
            return Double.NEGATIVE_INFINITY;
        }
        return nwg1.m65783s(j >> 1, (((int) j) & 1) == 0 ? ils.NANOSECONDS : ils.MILLISECONDS, ilsVar);
    }

    /* JADX INFO: renamed from: q */
    public static final int m33198q(long j, ils ilsVar) {
        return (int) n0e1.m63439p(m33199r(j, ilsVar), -2147483648L, 2147483647L);
    }

    /* JADX INFO: renamed from: r */
    public static final long m33199r(long j, ils ilsVar) {
        if (j == f39080c) {
            return Long.MAX_VALUE;
        }
        if (j == f39081d) {
            return Long.MIN_VALUE;
        }
        return nwg1.m65784t(j >> 1, (((int) j) & 1) == 0 ? ils.NANOSECONDS : ils.MILLISECONDS, ilsVar);
    }

    /* JADX INFO: renamed from: s */
    public static String m33200s(long j) {
        if (j == 0) {
            return "0s";
        }
        if (j == f39080c) {
            return "Infinity";
        }
        if (j == f39081d) {
            return "-Infinity";
        }
        int i = 0;
        boolean z = j < 0;
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append('-');
        }
        if (j < 0) {
            j = m33201t(j);
        }
        long jM33199r = m33199r(j, ils.DAYS);
        int iM33186e = m33186e(j);
        int iM33189h = m33189h(j);
        int iM33191j = m33191j(j);
        int iM33190i = m33190i(j);
        boolean z2 = jM33199r != 0;
        boolean z3 = iM33186e != 0;
        boolean z4 = iM33189h != 0;
        boolean z5 = (iM33191j == 0 && iM33190i == 0) ? false : true;
        if (z2) {
            sb.append(jM33199r);
            sb.append('d');
            i = 1;
        }
        if (z3 || (z2 && (z4 || z5))) {
            int i2 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(iM33186e);
            sb.append('h');
            i = i2;
        }
        if (z4 || (z5 && (z3 || z2))) {
            int i3 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(iM33189h);
            sb.append('m');
            i = i3;
        }
        if (z5) {
            int i4 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            if (iM33191j != 0 || z2 || z3 || z4) {
                m33183b(sb, iM33191j, iM33190i, 9, "s", false);
            } else if (iM33190i >= 1000000) {
                m33183b(sb, iM33190i / 1000000, iM33190i % 1000000, 6, "ms", false);
            } else if (iM33190i >= 1000) {
                m33183b(sb, iM33190i / 1000, iM33190i % 1000, 3, "us", false);
            } else {
                sb.append(iM33190i);
                sb.append("ns");
            }
            i = i4;
        }
        if (z && i > 1) {
            sb.insert(1, '(').append(')');
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: t */
    public static final long m33201t(long j) {
        return jwg1.m54456f(((int) j) & 1, -(j >> 1));
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return m33184c(this.f39083a, ((cks) obj).f39083a);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cks) {
            return this.f39083a == ((cks) obj).f39083a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f39083a);
    }

    public final String toString() {
        return m33200s(this.f39083a);
    }
}
