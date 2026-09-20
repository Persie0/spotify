package p204p;

import com.spotify.player.model.ContextTrack;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StreamCorruptedException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;
import org.threeten.p203bp.zone.ZoneRulesException;

/* JADX INFO: loaded from: classes3.dex */
public final class aq91 {

    /* JADX INFO: renamed from: c */
    public static final CopyOnWriteArrayList f18147c = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: d */
    public static final ConcurrentHashMap f18148d = new ConcurrentHashMap(512, 0.75f, 2);

    /* JADX INFO: renamed from: a */
    public List f18149a;

    /* JADX INFO: renamed from: b */
    public final ConcurrentSkipListMap f18150b = new ConcurrentSkipListMap();

    static {
        if (oze1.f172258a.getAndSet(true)) {
            throw new IllegalStateException("Already initialized");
        }
        AtomicReference atomicReference = oze1.f172259b;
        t3d1.m79998m(atomicReference, new nze1());
        ((oze1) atomicReference.get()).mo52876a();
    }

    public aq91(InputStream inputStream) {
        new CopyOnWriteArraySet();
        try {
            m26763b(inputStream);
        } catch (Exception e) {
            throw new ZoneRulesException("Unable to load TZDB time-zone rules", e);
        }
    }

    /* JADX INFO: renamed from: a */
    public static mze1 m26761a(String str) {
        mze1 mze1Var;
        jlg1.m53716z(str, "zoneId");
        ConcurrentHashMap concurrentHashMap = f18148d;
        aq91 aq91Var = (aq91) concurrentHashMap.get(str);
        if (aq91Var == null) {
            if (concurrentHashMap.isEmpty()) {
                throw new ZoneRulesException("No time-zone data files registered");
            }
            throw new ZoneRulesException("Unknown time-zone ID: ".concat(str));
        }
        zp91 zp91Var = (zp91) aq91Var.f18150b.lastEntry().getValue();
        int iBinarySearch = Arrays.binarySearch(zp91Var.f285028b, str);
        if (iBinarySearch < 0) {
            mze1Var = null;
        } else {
            try {
                short s = zp91Var.f285029c[iBinarySearch];
                AtomicReferenceArray atomicReferenceArray = zp91Var.f285030d;
                Object objM51641b = atomicReferenceArray.get(s);
                if (objM51641b instanceof byte[]) {
                    DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream((byte[]) objM51641b));
                    objM51641b = itz0.m51641b(dataInputStream.readByte(), dataInputStream);
                    atomicReferenceArray.set(s, objM51641b);
                }
                mze1Var = (mze1) objM51641b;
            } catch (Exception e) {
                StringBuilder sbM38572u = edb.m38572u("Invalid binary time-zone data: TZDB:", str, ", version: ");
                sbM38572u.append(zp91Var.f285027a);
                throw new ZoneRulesException(sbM38572u.toString(), e);
            }
        }
        if (mze1Var != null) {
            return mze1Var;
        }
        throw new ZoneRulesException("Unknown time-zone ID: ".concat(str));
    }

    /* JADX INFO: renamed from: c */
    public static void m26762c(aq91 aq91Var) {
        jlg1.m53716z(aq91Var, ContextTrack.Metadata.KEY_PROVIDER);
        for (String str : new HashSet(aq91Var.f18149a)) {
            jlg1.m53716z(str, "zoneId");
            if (((aq91) f18148d.putIfAbsent(str, aq91Var)) != null) {
                throw new ZoneRulesException("Unable to register zone as one already registered with that ID: " + str + ", currently loading from provider: " + aq91Var);
            }
        }
        f18147c.add(aq91Var);
    }

    /* JADX INFO: renamed from: b */
    public final void m26763b(InputStream inputStream) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        if (dataInputStream.readByte() != 1) {
            throw new StreamCorruptedException("File format not recognised");
        }
        if (!"TZDB".equals(dataInputStream.readUTF())) {
            throw new StreamCorruptedException("File format not recognised");
        }
        int i = dataInputStream.readShort();
        String[] strArr = new String[i];
        for (int i2 = 0; i2 < i; i2++) {
            strArr[i2] = dataInputStream.readUTF();
        }
        int i3 = dataInputStream.readShort();
        String[] strArr2 = new String[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            strArr2[i4] = dataInputStream.readUTF();
        }
        this.f18149a = Arrays.asList(strArr2);
        int i5 = dataInputStream.readShort();
        Object[] objArr = new Object[i5];
        for (int i6 = 0; i6 < i5; i6++) {
            byte[] bArr = new byte[dataInputStream.readShort()];
            dataInputStream.readFully(bArr);
            objArr[i6] = bArr;
        }
        AtomicReferenceArray atomicReferenceArray = new AtomicReferenceArray(objArr);
        HashSet<zp91> hashSet = new HashSet(i);
        for (int i7 = 0; i7 < i; i7++) {
            int i8 = dataInputStream.readShort();
            String[] strArr3 = new String[i8];
            short[] sArr = new short[i8];
            for (int i9 = 0; i9 < i8; i9++) {
                strArr3[i9] = strArr2[dataInputStream.readShort()];
                sArr[i9] = dataInputStream.readShort();
            }
            hashSet.add(new zp91(strArr[i7], strArr3, sArr, atomicReferenceArray));
        }
        for (zp91 zp91Var : hashSet) {
            String str = zp91Var.f285027a;
            zp91 zp91Var2 = (zp91) this.f18150b.putIfAbsent(str, zp91Var);
            if (zp91Var2 != null && !zp91Var2.f285027a.equals(str)) {
                throw new ZoneRulesException(edb.m38564m("Data already loaded for TZDB time-zone rules version: ", str));
            }
        }
    }

    public final String toString() {
        return "TZDB";
    }
}
