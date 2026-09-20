package p204p;

import android.content.Context;
import android.util.SparseArray;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public abstract class uif1 {

    /* JADX INFO: renamed from: a */
    public static final AtomicReference f230679a;

    static {
        SparseArray sparseArray = new SparseArray();
        SparseArray sparseArray2 = new SparseArray();
        f230679a = new AtomicReference();
        sparseArray.put(-1, kzg1.FORMAT_UNKNOWN);
        sparseArray.put(1, kzg1.FORMAT_CODE_128);
        sparseArray.put(2, kzg1.FORMAT_CODE_39);
        sparseArray.put(4, kzg1.FORMAT_CODE_93);
        sparseArray.put(8, kzg1.FORMAT_CODABAR);
        sparseArray.put(16, kzg1.FORMAT_DATA_MATRIX);
        sparseArray.put(32, kzg1.FORMAT_EAN_13);
        sparseArray.put(64, kzg1.FORMAT_EAN_8);
        sparseArray.put(128, kzg1.FORMAT_ITF);
        sparseArray.put(256, kzg1.FORMAT_QR_CODE);
        sparseArray.put(512, kzg1.FORMAT_UPC_A);
        sparseArray.put(1024, kzg1.FORMAT_UPC_E);
        sparseArray.put(2048, kzg1.FORMAT_PDF417);
        sparseArray.put(4096, kzg1.FORMAT_AZTEC);
        sparseArray2.put(0, ozg1.TYPE_UNKNOWN);
        sparseArray2.put(1, ozg1.TYPE_CONTACT_INFO);
        sparseArray2.put(2, ozg1.TYPE_EMAIL);
        sparseArray2.put(3, ozg1.TYPE_ISBN);
        sparseArray2.put(4, ozg1.TYPE_PHONE);
        sparseArray2.put(5, ozg1.TYPE_PRODUCT);
        sparseArray2.put(6, ozg1.TYPE_SMS);
        sparseArray2.put(7, ozg1.TYPE_TEXT);
        sparseArray2.put(8, ozg1.TYPE_URL);
        sparseArray2.put(9, ozg1.TYPE_WIFI);
        sparseArray2.put(10, ozg1.TYPE_GEO);
        sparseArray2.put(11, ozg1.TYPE_CALENDAR_EVENT);
        sparseArray2.put(12, ozg1.TYPE_DRIVER_LICENSE);
        HashMap map = new HashMap();
        map.put(1, o7h1.CODE_128);
        map.put(2, o7h1.CODE_39);
        map.put(4, o7h1.CODE_93);
        map.put(8, o7h1.CODABAR);
        map.put(16, o7h1.DATA_MATRIX);
        map.put(32, o7h1.EAN_13);
        map.put(64, o7h1.EAN_8);
        map.put(128, o7h1.ITF);
        map.put(256, o7h1.QR_CODE);
        map.put(512, o7h1.UPC_A);
        map.put(1024, o7h1.UPC_E);
        map.put(2048, o7h1.PDF417);
        map.put(4096, o7h1.AZTEC);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m83201a() {
        AtomicReference atomicReference = f230679a;
        if (atomicReference.get() != null) {
            return ((Boolean) atomicReference.get()).booleanValue();
        }
        Context contextM31789b = c8g0.m31786c().m31789b();
        int i = wrg1.f254357a;
        boolean z = aos.m26613a(contextM31789b, "com.google.mlkit.dynamite.barcode") > 0;
        atomicReference.set(Boolean.valueOf(z));
        return z;
    }
}
