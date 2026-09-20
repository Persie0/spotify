package p204p;

import android.graphics.BitmapFactory;
import android.graphics.Paint;
import android.net.Uri;
import android.util.Base64;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class o0i0 {

    /* JADX INFO: renamed from: b */
    public static final Paint f160406b = new Paint(3);

    /* JADX INFO: renamed from: a */
    public final oqw f160407a;

    public o0i0(oqw oqwVar) {
        this.f160407a = oqwVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX INFO: renamed from: a */
    public final Object m66018a(String str, int i, int i2, ibk ibkVar) throws IOException {
        k0i0 k0i0Var;
        int iMax;
        Object objM66019b;
        ArrayList arrayList;
        String strEncodeToString;
        int i3 = i;
        int i4 = i2;
        if (ibkVar instanceof k0i0) {
            k0i0Var = (k0i0) ibkVar;
            int i5 = k0i0Var.f118114g;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                k0i0Var.f118114g = i5 - Integer.MIN_VALUE;
            } else {
                k0i0Var = new k0i0(this, ibkVar);
            }
        } else {
            k0i0Var = new k0i0(this, ibkVar);
        }
        Object obj = k0i0Var.f118112e;
        int i6 = k0i0Var.f118114g;
        Object obj2 = yuk.f276404a;
        if (i6 == 0) {
            bga.m29073P(obj);
            if (!qvf1.m74029z(str)) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (!qvf1.m74029z(str)) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            List listM74021r = qvf1.m74021r(str);
            int size = listM74021r.size();
            ArrayList arrayList2 = new ArrayList(size);
            for (int i7 = 0; i7 < size; i7++) {
                String strM74012i = qvf1.m74012i((String) listM74021r.get(i7));
                if (bm51.m29803n0((String) listM74021r.get(i7), "localfileimage", false)) {
                    strEncodeToString = Base64.encodeToString(edb.m38564m("spotify:", Uri.decode((String) listM74021r.get(i7))).getBytes(vuc.f244913a), 0);
                } else if (bm51.m29803n0(strM74012i, "http://", false) || bm51.m29803n0(strM74012i, "https://", false) || bm51.m29803n0(strM74012i, "spotify:image:", false)) {
                    strEncodeToString = Base64.encodeToString(Uri.parse(strM74012i).toString().getBytes(vuc.f244913a), 0);
                } else {
                    strEncodeToString = Base64.encodeToString(Uri.parse("spotify:image:" + listM74021r.get(i7)).toString().getBytes(vuc.f244913a), 0);
                }
                arrayList2.add(strEncodeToString);
            }
            iMax = (i3 == 0 || i4 == 0) ? 300 : Math.max(i, i2);
            if (arrayList2.isEmpty() || arrayList2.size() == 4) {
                if (arrayList2.isEmpty()) {
                    return null;
                }
                k0i0Var.f118108a = arrayList2;
                k0i0Var.f118109b = i3;
                k0i0Var.f118110c = i4;
                k0i0Var.f118111d = iMax;
                k0i0Var.f118114g = 2;
                objM66019b = m66019b(arrayList2, iMax, k0i0Var);
                if (objM66019b != obj2) {
                    arrayList = arrayList2;
                }
            } else {
                k0i0Var.f118108a = null;
                k0i0Var.f118109b = i3;
                k0i0Var.f118110c = i4;
                k0i0Var.f118111d = iMax;
                k0i0Var.f118114g = 1;
                Object objM66021d = m66021d(arrayList2, iMax, k0i0Var);
                if (objM66021d != obj2) {
                    return objM66021d;
                }
            }
        }
        if (i6 == 1) {
            bga.m29073P(obj);
            return obj;
        }
        if (i6 != 2) {
            if (i6 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
            return obj;
        }
        int i8 = k0i0Var.f118111d;
        i4 = k0i0Var.f118110c;
        int i9 = k0i0Var.f118109b;
        arrayList = k0i0Var.f118108a;
        bga.m29073P(obj);
        iMax = i8;
        i3 = i9;
        objM66019b = obj;
        v250 v250Var = (v250) objM66019b;
        if (v250Var != null) {
            return v250Var;
        }
        k0i0Var.f118108a = null;
        k0i0Var.f118109b = i3;
        k0i0Var.f118110c = i4;
        k0i0Var.f118111d = iMax;
        k0i0Var.f118114g = 3;
        Object objM66021d2 = m66021d(arrayList, iMax, k0i0Var);
        return objM66021d2 == obj2 ? obj2 : objM66021d2;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:26:0x0120  */
    /* JADX WARN: Code duplicated, block: B:29:0x0134  */
    /* JADX WARN: Code duplicated, block: B:30:0x013c  */
    /* JADX WARN: Code duplicated, block: B:33:0x0164  */
    /* JADX WARN: Code duplicated, block: B:36:0x0179  */
    /* JADX WARN: Code duplicated, block: B:37:0x017e  */
    /* JADX WARN: Code duplicated, block: B:40:0x0189 A[Catch: all -> 0x0197, TryCatch #0 {all -> 0x0197, blocks: (B:38:0x0183, B:40:0x0189, B:43:0x019b, B:45:0x01a5, B:47:0x01e0, B:66:0x0215, B:68:0x021b, B:72:0x0223, B:71:0x0220, B:56:0x01fc, B:57:0x0201, B:46:0x01cc), top: B:86:0x0183 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x019b A[Catch: all -> 0x0197, TryCatch #0 {all -> 0x0197, blocks: (B:38:0x0183, B:40:0x0189, B:43:0x019b, B:45:0x01a5, B:47:0x01e0, B:66:0x0215, B:68:0x021b, B:72:0x0223, B:71:0x0220, B:56:0x01fc, B:57:0x0201, B:46:0x01cc), top: B:86:0x0183 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x01a5 A[Catch: all -> 0x0197, TryCatch #0 {all -> 0x0197, blocks: (B:38:0x0183, B:40:0x0189, B:43:0x019b, B:45:0x01a5, B:47:0x01e0, B:66:0x0215, B:68:0x021b, B:72:0x0223, B:71:0x0220, B:56:0x01fc, B:57:0x0201, B:46:0x01cc), top: B:86:0x0183 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x01cc A[Catch: all -> 0x0197, TryCatch #0 {all -> 0x0197, blocks: (B:38:0x0183, B:40:0x0189, B:43:0x019b, B:45:0x01a5, B:47:0x01e0, B:66:0x0215, B:68:0x021b, B:72:0x0223, B:71:0x0220, B:56:0x01fc, B:57:0x0201, B:46:0x01cc), top: B:86:0x0183 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:51:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:53:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:55:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:56:0x01fc A[Catch: all -> 0x0197, TryCatch #0 {all -> 0x0197, blocks: (B:38:0x0183, B:40:0x0189, B:43:0x019b, B:45:0x01a5, B:47:0x01e0, B:66:0x0215, B:68:0x021b, B:72:0x0223, B:71:0x0220, B:56:0x01fc, B:57:0x0201, B:46:0x01cc), top: B:86:0x0183 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0202  */
    /* JADX WARN: Code duplicated, block: B:59:0x0205  */
    /* JADX WARN: Code duplicated, block: B:61:0x020a  */
    /* JADX WARN: Code duplicated, block: B:62:0x020b  */
    /* JADX WARN: Code duplicated, block: B:64:0x0212  */
    /* JADX WARN: Code duplicated, block: B:65:0x0213 A[PHI: r0 r4 r21
      0x0213: PHI (r0v17 int) = (r0v16 int), (r0v20 int), (r0v21 int) binds: [B:63:0x0210, B:60:0x0208, B:58:0x0202] A[DONT_GENERATE, DONT_INLINE]
      0x0213: PHI (r4v11 int) = (r4v10 int), (r4v13 int), (r4v14 int) binds: [B:63:0x0210, B:60:0x0208, B:58:0x0202] A[DONT_GENERATE, DONT_INLINE]
      0x0213: PHI (r21v1 p.fsk) = (r21v0 p.fsk), (r21v2 p.fsk), (r21v2 p.fsk) binds: [B:63:0x0210, B:60:0x0208, B:58:0x0202] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x021b A[Catch: all -> 0x0197, TryCatch #0 {all -> 0x0197, blocks: (B:38:0x0183, B:40:0x0189, B:43:0x019b, B:45:0x01a5, B:47:0x01e0, B:66:0x0215, B:68:0x021b, B:72:0x0223, B:71:0x0220, B:56:0x01fc, B:57:0x0201, B:46:0x01cc), top: B:86:0x0183 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x0220 A[Catch: all -> 0x0197, TryCatch #0 {all -> 0x0197, blocks: (B:38:0x0183, B:40:0x0189, B:43:0x019b, B:45:0x01a5, B:47:0x01e0, B:66:0x0215, B:68:0x021b, B:72:0x0223, B:71:0x0220, B:56:0x01fc, B:57:0x0201, B:46:0x01cc), top: B:86:0x0183 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:80:0x0258  */
    /* JADX WARN: Code duplicated, block: B:82:0x025e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0164 -> B:34:0x0175). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: b */
    public final java.lang.Object m66019b(java.util.ArrayList r24, int r25, p204p.ibk r26) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 628
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p204p.o0i0.m66019b(java.util.ArrayList, int, p.ibk):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m66020c(int i, String str, ibk ibkVar) throws IOException {
        m0i0 m0i0Var;
        plv0 plv0Var;
        if (ibkVar instanceof m0i0) {
            m0i0Var = (m0i0) ibkVar;
            int i2 = m0i0Var.f138688e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                m0i0Var.f138688e = i2 - Integer.MIN_VALUE;
            } else {
                m0i0Var = new m0i0(this, ibkVar);
            }
        } else {
            m0i0Var = new m0i0(this, ibkVar);
        }
        Object obj = m0i0Var.f138686c;
        int i3 = m0i0Var.f138688e;
        if (i3 == 0) {
            bga.m29073P(obj);
            plv0 plv0Var2 = new plv0();
            plv0Var2.f178796a = 1;
            m0i0Var.f138684a = plv0Var2;
            m0i0Var.f138685b = i;
            m0i0Var.f138688e = 1;
            Object objMo62238b = this.f160407a.f168395d.mo62238b(str, i, i, m0i0Var);
            yuk yukVar = yuk.f276404a;
            if (objMo62238b == yukVar) {
                return yukVar;
            }
            obj = objMo62238b;
            plv0Var = plv0Var2;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = m0i0Var.f138685b;
            plv0Var = m0i0Var.f138684a;
            bga.m29073P(obj);
        }
        l540 l540Var = (l540) obj;
        if (l540Var == null) {
            return null;
        }
        InputStream inputStream = l540Var.f129819a;
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeStream(inputStream, null, options);
            if (options.outHeight > i || options.outWidth > i) {
                float f = i;
                plv0Var.f178796a = Math.min(q3d0.m72083N(options.outHeight / f), q3d0.m72083N(options.outWidth / f));
            }
            inputStream.close();
            BitmapFactory.Options options2 = new BitmapFactory.Options();
            options2.inJustDecodeBounds = false;
            options2.inSampleSize = plv0Var.f178796a;
            return options2;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                n0e1.m63430g(inputStream, th);
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0059  */
    /* JADX WARN: Code duplicated, block: B:22:0x0070  */
    /* JADX WARN: Code duplicated, block: B:25:0x0077  */
    /* JADX WARN: Code duplicated, block: B:28:0x008c  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x008c -> B:29:0x0090). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00b6 -> B:17:0x0053). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: d */
    public final java.lang.Object m66021d(java.util.List r9, int r10, p204p.ibk r11) throws java.io.IOException {
        /*
            r8 = this;
            boolean r0 = r11 instanceof p204p.n0i0
            if (r0 == 0) goto L13
            r0 = r11
            p.n0i0 r0 = (p204p.n0i0) r0
            int r1 = r0.f149096g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f149096g = r1
            goto L18
        L13:
            p.n0i0 r0 = new p.n0i0
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.f149094e
            int r1 = r0.f149096g
            r2 = 2
            r3 = 1
            r4 = 0
            p.yuk r5 = p204p.yuk.f276404a
            if (r1 == 0) goto L4c
            if (r1 == r3) goto L3e
            if (r1 != r2) goto L36
            int r9 = r0.f149093d
            android.graphics.BitmapFactory$Options r10 = r0.f149092c
            java.util.Iterator r1 = r0.f149090a
            p204p.bga.m29073P(r11)
            r7 = r11
            r11 = r9
            r9 = r1
            r1 = r0
            r0 = r7
            goto L90
        L36:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3e:
            int r9 = r0.f149093d
            java.lang.String r10 = r0.f149091b
            java.util.Iterator r1 = r0.f149090a
            p204p.bga.m29073P(r11)
            r7 = r11
            r11 = r9
            r9 = r1
            r1 = r7
            goto L73
        L4c:
            p204p.bga.m29073P(r11)
            java.util.Iterator r9 = r9.iterator()
        L53:
            boolean r11 = r9.hasNext()
            if (r11 == 0) goto Lb8
            java.lang.Object r11 = r9.next()
            java.lang.String r11 = (java.lang.String) r11
            r0.f149090a = r9
            r0.f149091b = r11
            r0.f149092c = r4
            r0.f149093d = r10
            r0.f149096g = r3
            java.lang.Object r1 = r8.m66020c(r10, r11, r0)
            if (r1 != r5) goto L70
            goto L8b
        L70:
            r7 = r11
            r11 = r10
            r10 = r7
        L73:
            android.graphics.BitmapFactory$Options r1 = (android.graphics.BitmapFactory.Options) r1
            if (r1 == 0) goto Lb6
            r0.f149090a = r9
            r0.f149091b = r4
            r0.f149092c = r1
            r0.f149093d = r11
            r0.f149096g = r2
            p.oqw r6 = r8.f160407a
            p.rlq r6 = r6.f168395d
            java.lang.Object r10 = r6.mo62238b(r10, r11, r11, r0)
            if (r10 != r5) goto L8c
        L8b:
            return r5
        L8c:
            r7 = r0
            r0 = r10
            r10 = r1
            r1 = r7
        L90:
            p.l540 r0 = (p204p.l540) r0
            if (r0 == 0) goto Lb3
            java.io.InputStream r6 = r0.f129819a
            android.graphics.Bitmap r10 = android.graphics.BitmapFactory.decodeStream(r6, r4, r10)     // Catch: java.lang.Throwable -> La7
            if (r10 == 0) goto La9
            p.v250 r9 = new p.v250     // Catch: java.lang.Throwable -> La7
            p.fsk r11 = r0.f129820b     // Catch: java.lang.Throwable -> La7
            r9.<init>(r10, r11, r4)     // Catch: java.lang.Throwable -> La7
            r6.close()
            return r9
        La7:
            r9 = move-exception
            goto Lad
        La9:
            r6.close()
            goto Lb3
        Lad:
            throw r9     // Catch: java.lang.Throwable -> Lae
        Lae:
            r10 = move-exception
            p204p.n0e1.m63430g(r6, r9)
            throw r10
        Lb3:
            r10 = r11
            r0 = r1
            goto L53
        Lb6:
            r10 = r11
            goto L53
        Lb8:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p204p.o0i0.m66021d(java.util.List, int, p.ibk):java.lang.Object");
    }
}
