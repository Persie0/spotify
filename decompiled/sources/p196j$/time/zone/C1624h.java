package p196j$.time.zone;

import com.spotify.player.model.ContextTrack;
import java.security.AccessController;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: j$.time.zone.h */
/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public final class C1624h {

    /* JADX INFO: renamed from: b */
    public static final CopyOnWriteArrayList f10890b;

    /* JADX INFO: renamed from: c */
    public static final ConcurrentMap f10891c;

    /* JADX INFO: renamed from: d */
    public static volatile Set f10892d;

    /* JADX INFO: renamed from: a */
    public final Set f10893a;

    static {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        f10890b = copyOnWriteArrayList;
        f10891c = new ConcurrentHashMap(512, 0.75f, 2);
        ArrayList arrayList = new ArrayList();
        AccessController.doPrivileged(new C1623g(arrayList));
        copyOnWriteArrayList.addAll(arrayList);
    }

    public C1624h() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str : TimeZone.getAvailableIDs()) {
            linkedHashSet.add(str);
        }
        this.f10893a = Collections.unmodifiableSet(linkedHashSet);
    }

    /* JADX INFO: renamed from: a */
    public static ZoneRules m24207a(String str) {
        Objects.requireNonNull(str, "zoneId");
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) f10891c;
        C1624h c1624h = (C1624h) concurrentHashMap.get(str);
        if (c1624h == null) {
            if (concurrentHashMap.isEmpty()) {
                throw new C1622f("No time-zone data files registered");
            }
            throw new C1622f("Unknown time-zone ID: ".concat(str));
        }
        if (c1624h.f10893a.contains(str)) {
            return new ZoneRules(TimeZone.getTimeZone(str));
        }
        throw new C1622f("Not a built-in time zone: ".concat(str));
    }

    /* JADX INFO: renamed from: b */
    public static void m24208b(C1624h c1624h) {
        Objects.requireNonNull(c1624h, ContextTrack.Metadata.KEY_PROVIDER);
        synchronized (C1624h.class) {
            try {
                for (String str : c1624h.f10893a) {
                    Objects.requireNonNull(str, "zoneId");
                    if (((C1624h) ((ConcurrentHashMap) f10891c).putIfAbsent(str, c1624h)) != null) {
                        throw new C1622f("Unable to register zone as one already registered with that ID: " + str + ", currently loading from provider: " + c1624h);
                    }
                }
                f10892d = Collections.unmodifiableSet(new HashSet(((ConcurrentHashMap) f10891c).keySet()));
            } catch (Throwable th) {
                throw th;
            }
        }
        f10890b.add(c1624h);
    }
}
