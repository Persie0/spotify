package p204p;

/* JADX INFO: loaded from: classes2.dex */
public enum gce implements gz61 {
    NANOS("Nanos", dks.m36314c(1)),
    /* JADX INFO: Fake field, exist only in values array */
    MICROS("Micros", dks.m36314c(1000)),
    /* JADX INFO: Fake field, exist only in values array */
    MILLIS("Millis", dks.m36314c(1000000)),
    SECONDS("Seconds", dks.m36312a(0, 1)),
    MINUTES("Minutes", dks.m36312a(0, 60)),
    HOURS("Hours", dks.m36312a(0, 3600)),
    /* JADX INFO: Fake field, exist only in values array */
    HALF_DAYS("HalfDays", dks.m36312a(0, 43200)),
    DAYS("Days", dks.m36312a(0, 86400)),
    WEEKS("Weeks", dks.m36312a(0, 604800)),
    MONTHS("Months", dks.m36312a(0, 2629746)),
    YEARS("Years", dks.m36312a(0, 31556952)),
    /* JADX INFO: Fake field, exist only in values array */
    DECADES("Decades", dks.m36312a(0, 315569520)),
    /* JADX INFO: Fake field, exist only in values array */
    CENTURIES("Centuries", dks.m36312a(0, 3155695200L)),
    /* JADX INFO: Fake field, exist only in values array */
    MILLENNIA("Millennia", dks.m36312a(0, 31556952000L)),
    /* JADX INFO: Fake field, exist only in values array */
    ERAS("Eras", dks.m36312a(0, 31556952000000000L)),
    FOREVER("Forever", dks.m36315d(Long.MAX_VALUE, 999999999));


    /* JADX INFO: renamed from: a */
    public final String f78574a;

    /* JADX INFO: renamed from: b */
    public final dks f78575b;

    gce(String str, dks dksVar) {
        this.f78574a = str;
        this.f78575b = dksVar;
    }

    @Override // p204p.gz61
    /* JADX INFO: renamed from: a */
    public final az61 mo44316a(az61 az61Var, long j) {
        return az61Var.mo27574i(j, this);
    }

    @Override // p204p.gz61
    /* JADX INFO: renamed from: b */
    public final long mo44317b(az61 az61Var, az61 az61Var2) {
        return az61Var.mo27576m(az61Var2, this);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f78574a;
    }
}
