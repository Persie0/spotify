package p204p;

import android.content.pm.PackageManager;
import android.content.pm.Signature;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class zb30 {

    /* JADX INFO: renamed from: a */
    public final HashMap f281223a;

    /* JADX INFO: renamed from: b */
    public final boolean f281224b;

    /* JADX INFO: renamed from: c */
    public final HashMap f281225c = new HashMap();

    /* JADX INFO: renamed from: d */
    public final PackageManager f281226d;

    static {
        new zb30(null, new HashMap(), true);
    }

    public zb30(PackageManager packageManager, HashMap map, boolean z) {
        this.f281226d = packageManager;
        this.f281223a = map;
        this.f281224b = z;
    }

    /* JADX INFO: renamed from: a */
    public static String m95816a(Signature signature) {
        MessageDigest messageDigest;
        byte[] byteArray = signature.toByteArray();
        try {
            messageDigest = MessageDigest.getInstance("SHA256");
        } catch (NoSuchAlgorithmException unused) {
            messageDigest = null;
        }
        if (messageDigest == null) {
            return null;
        }
        messageDigest.update(byteArray);
        byte[] bArrDigest = messageDigest.digest();
        StringBuilder sb = new StringBuilder((bArrDigest.length * 3) - 1);
        for (byte b : bArrDigest) {
            sb.append(String.format("%02x", Byte.valueOf(b)));
        }
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:29:0x005b  */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:86:0x0044
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1478)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /* JADX INFO: renamed from: b */
    public final boolean m95817b(p204p.sgz r14) {
        /*
            Method dump skipped, instruction units count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p204p.zb30.m95817b(p.sgz):boolean");
    }
}
