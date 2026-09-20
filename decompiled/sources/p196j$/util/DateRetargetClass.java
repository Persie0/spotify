package p196j$.util;

import java.util.Date;
import p196j$.time.Instant;

/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class DateRetargetClass {
    public static Instant toInstant(Date date) {
        long time = date.getTime();
        Instant instant = Instant.f10608c;
        long j = 1000;
        return Instant.m23943r(Math.floorDiv(time, j), ((int) Math.floorMod(time, j)) * 1000000);
    }
}
