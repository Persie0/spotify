package androidx.media3.exoplayer.video;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Pair;
import android.util.SparseArray;
import android.view.Surface;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.mediacodec.MediaCodecDecoderException;
import com.comscore.streaming.ContentType;
import com.spotify.concertcampaignview.p047v1.CtaType;
import com.spotify.metadata.classic.proto.Metadata$Episode;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import com.spotify.signup.signup.p150v2.proto.Error;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import p204p.abd0;
import p204p.b381;
import p204p.bbd0;
import p204p.bhs;
import p204p.bka1;
import p204p.c6p0;
import p204p.c95;
import p204p.cbd0;
import p204p.d7o0;
import p204p.def0;
import p204p.dgd0;
import p204p.di21;
import p204p.e7o0;
import p204p.euf;
import p204p.f6p0;
import p204p.fw7;
import p204p.fz6;
import p204p.gh61;
import p204p.gha;
import p204p.h0b1;
import p204p.h57;
import p204p.hos;
import p204p.hra;
import p204p.hro;
import p204p.i9c1;
import p204p.iez;
import p204p.iqk0;
import p204p.iro;
import p204p.jqk0;
import p204p.k9c1;
import p204p.kf40;
import p204p.kgd0;
import p204p.kqk0;
import p204p.kro;
import p204p.kwe;
import p204p.l5c1;
import p204p.loy0;
import p204p.lzj;
import p204p.m5c1;
import p204p.mwe;
import p204p.n5c1;
import p204p.nn40;
import p204p.o09;
import p204p.oci0;
import p204p.oxb1;
import p204p.p1y0;
import p204p.p300;
import p204p.p711;
import p204p.p7f;
import p204p.pad0;
import p204p.pf40;
import p204p.qad0;
import p204p.qkw0;
import p204p.r300;
import p204p.sa8;
import p204p.tad0;
import p204p.vad0;
import p204p.vpo;
import p204p.vsd0;
import p204p.w1h1;
import p204p.wad0;
import p204p.wra;
import p204p.wsv0;
import p204p.x8t;
import p204p.xxb1;
import p204p.xyx;
import p204p.yho;
import p204p.yif1;
import p204p.z5p0;
import p204p.zad0;
import p204p.zca0;
import p204p.zxb1;

/* JADX INFO: renamed from: androidx.media3.exoplayer.video.b */
/* JADX INFO: loaded from: classes3.dex */
public class C0068b extends vad0 {

    /* JADX INFO: renamed from: c3 */
    public static final int[] f1029c3 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};

    /* JADX INFO: renamed from: d3 */
    public static boolean f1030d3;

    /* JADX INFO: renamed from: e3 */
    public static boolean f1031e3;

    /* JADX INFO: renamed from: A2 */
    public int f1032A2;

    /* JADX INFO: renamed from: B2 */
    public List f1033B2;

    /* JADX INFO: renamed from: C2 */
    public Surface f1034C2;

    /* JADX INFO: renamed from: D2 */
    public e7o0 f1035D2;

    /* JADX INFO: renamed from: E2 */
    public di21 f1036E2;

    /* JADX INFO: renamed from: F2 */
    public boolean f1037F2;

    /* JADX INFO: renamed from: G2 */
    public int f1038G2;

    /* JADX INFO: renamed from: H2 */
    public int f1039H2;

    /* JADX INFO: renamed from: I2 */
    public long f1040I2;

    /* JADX INFO: renamed from: J2 */
    public int f1041J2;

    /* JADX INFO: renamed from: K2 */
    public int f1042K2;

    /* JADX INFO: renamed from: L2 */
    public int f1043L2;

    /* JADX INFO: renamed from: M2 */
    public loy0 f1044M2;

    /* JADX INFO: renamed from: N2 */
    public long f1045N2;

    /* JADX INFO: renamed from: O2 */
    public boolean f1046O2;

    /* JADX INFO: renamed from: P2 */
    public long f1047P2;

    /* JADX INFO: renamed from: Q2 */
    public int f1048Q2;

    /* JADX INFO: renamed from: R2 */
    public long f1049R2;

    /* JADX INFO: renamed from: S2 */
    public k9c1 f1050S2;

    /* JADX INFO: renamed from: T2 */
    public k9c1 f1051T2;

    /* JADX INFO: renamed from: U2 */
    public int f1052U2;

    /* JADX INFO: renamed from: V2 */
    public boolean f1053V2;

    /* JADX INFO: renamed from: W2 */
    public int f1054W2;

    /* JADX INFO: renamed from: X2 */
    public cbd0 f1055X2;

    /* JADX INFO: renamed from: Y2 */
    public oxb1 f1056Y2;

    /* JADX INFO: renamed from: Z2 */
    public long f1057Z2;

    /* JADX INFO: renamed from: a3 */
    public boolean f1058a3;

    /* JADX INFO: renamed from: b3 */
    public int f1059b3;

    /* JADX INFO: renamed from: h2 */
    public final Context f1060h2;

    /* JADX INFO: renamed from: i2 */
    public final boolean f1061i2;

    /* JADX INFO: renamed from: j2 */
    public final bka1 f1062j2;

    /* JADX INFO: renamed from: k2 */
    public final int f1063k2;

    /* JADX INFO: renamed from: l2 */
    public final boolean f1064l2;

    /* JADX INFO: renamed from: m2 */
    public final C0069c f1065m2;

    /* JADX INFO: renamed from: n2 */
    public final gha f1066n2;

    /* JADX INFO: renamed from: o2 */
    public final iez f1067o2;

    /* JADX INFO: renamed from: p2 */
    public final fw7 f1068p2;

    /* JADX INFO: renamed from: q2 */
    public final long f1069q2;

    /* JADX INFO: renamed from: r2 */
    public final zxb1 f1070r2;

    /* JADX INFO: renamed from: s2 */
    public final PriorityQueue f1071s2;

    /* JADX INFO: renamed from: t2 */
    public sa8 f1072t2;

    /* JADX INFO: renamed from: u2 */
    public boolean f1073u2;

    /* JADX INFO: renamed from: v2 */
    public boolean f1074v2;

    /* JADX INFO: renamed from: w2 */
    public boolean f1075w2;

    /* JADX INFO: renamed from: x2 */
    public boolean f1076x2;

    /* JADX INFO: renamed from: y2 */
    public i9c1 f1077y2;

    /* JADX INFO: renamed from: z2 */
    public boolean f1078z2;

    /* JADX WARN: Illegal instructions before constructor call */
    public C0068b(x8t x8tVar) {
        Context context = (Context) x8tVar.f259222e;
        super(context.getApplicationContext(), 2, (pad0) x8tVar.f259223f, x8tVar.f259220c);
        Context applicationContext = context.getApplicationContext();
        this.f1060h2 = applicationContext;
        this.f1063k2 = x8tVar.f259221d;
        this.f1077y2 = null;
        this.f1062j2 = new bka1((Handler) x8tVar.f259224g, (n5c1) x8tVar.f259225h);
        this.f1061i2 = this.f1077y2 == null;
        this.f1065m2 = new C0069c(applicationContext, this, x8tVar.f259219b);
        this.f1066n2 = new gha();
        this.f1067o2 = new iez(new zca0(this, 9));
        HashSet hashSet = dgd0.f48781a;
        this.f1064l2 = "NVIDIA".equals(Build.MANUFACTURER);
        this.f1036E2 = di21.f49218c;
        this.f1038G2 = 1;
        this.f1039H2 = 0;
        this.f1050S2 = k9c1.f120559d;
        this.f1054W2 = 0;
        this.f1051T2 = null;
        this.f1052U2 = -1000;
        this.f1057Z2 = -9223372036854775807L;
        this.f1068p2 = new fw7();
        this.f1071s2 = new PriorityQueue();
        this.f1069q2 = -15000L;
        this.f1070r2 = new zxb1();
        this.f1044M2 = null;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0126  */
    /* JADX WARN: Code duplicated, block: B:102:0x0129  */
    /* JADX WARN: Code duplicated, block: B:105:0x0132  */
    /* JADX WARN: Code duplicated, block: B:106:0x0136  */
    /* JADX WARN: Code duplicated, block: B:109:0x013f  */
    /* JADX WARN: Code duplicated, block: B:110:0x0143  */
    /* JADX WARN: Code duplicated, block: B:113:0x014c  */
    /* JADX WARN: Code duplicated, block: B:114:0x0150  */
    /* JADX WARN: Code duplicated, block: B:117:0x0159  */
    /* JADX WARN: Code duplicated, block: B:118:0x015d  */
    /* JADX WARN: Code duplicated, block: B:121:0x0166  */
    /* JADX WARN: Code duplicated, block: B:122:0x016a  */
    /* JADX WARN: Code duplicated, block: B:125:0x0173  */
    /* JADX WARN: Code duplicated, block: B:126:0x0177  */
    /* JADX WARN: Code duplicated, block: B:129:0x0180  */
    /* JADX WARN: Code duplicated, block: B:130:0x0184  */
    /* JADX WARN: Code duplicated, block: B:133:0x018d  */
    /* JADX WARN: Code duplicated, block: B:134:0x0191  */
    /* JADX WARN: Code duplicated, block: B:137:0x019a  */
    /* JADX WARN: Code duplicated, block: B:138:0x019e  */
    /* JADX WARN: Code duplicated, block: B:141:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:142:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:145:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:146:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:149:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:150:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:153:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:154:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:157:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:158:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:161:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:162:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:165:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:166:0x0200  */
    /* JADX WARN: Code duplicated, block: B:169:0x020a  */
    /* JADX WARN: Code duplicated, block: B:170:0x020e  */
    /* JADX WARN: Code duplicated, block: B:173:0x0218  */
    /* JADX WARN: Code duplicated, block: B:174:0x021c  */
    /* JADX WARN: Code duplicated, block: B:177:0x0226  */
    /* JADX WARN: Code duplicated, block: B:178:0x022a  */
    /* JADX WARN: Code duplicated, block: B:181:0x0234  */
    /* JADX WARN: Code duplicated, block: B:182:0x0238  */
    /* JADX WARN: Code duplicated, block: B:185:0x0242  */
    /* JADX WARN: Code duplicated, block: B:186:0x0246  */
    /* JADX WARN: Code duplicated, block: B:189:0x0250  */
    /* JADX WARN: Code duplicated, block: B:190:0x0254  */
    /* JADX WARN: Code duplicated, block: B:193:0x025e  */
    /* JADX WARN: Code duplicated, block: B:194:0x0262  */
    /* JADX WARN: Code duplicated, block: B:197:0x026c  */
    /* JADX WARN: Code duplicated, block: B:198:0x0270  */
    /* JADX WARN: Code duplicated, block: B:201:0x027a  */
    /* JADX WARN: Code duplicated, block: B:202:0x027e  */
    /* JADX WARN: Code duplicated, block: B:205:0x0288  */
    /* JADX WARN: Code duplicated, block: B:206:0x028c  */
    /* JADX WARN: Code duplicated, block: B:209:0x0296  */
    /* JADX WARN: Code duplicated, block: B:210:0x029a  */
    /* JADX WARN: Code duplicated, block: B:213:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:214:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:217:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:218:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:221:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:222:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:225:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:226:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:229:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:230:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:233:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:234:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:237:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:238:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:241:0x0306  */
    /* JADX WARN: Code duplicated, block: B:242:0x030a  */
    /* JADX WARN: Code duplicated, block: B:245:0x0314  */
    /* JADX WARN: Code duplicated, block: B:246:0x0318  */
    /* JADX WARN: Code duplicated, block: B:249:0x0322  */
    /* JADX WARN: Code duplicated, block: B:250:0x0326  */
    /* JADX WARN: Code duplicated, block: B:253:0x0330  */
    /* JADX WARN: Code duplicated, block: B:254:0x0334  */
    /* JADX WARN: Code duplicated, block: B:257:0x033e  */
    /* JADX WARN: Code duplicated, block: B:258:0x0342  */
    /* JADX WARN: Code duplicated, block: B:261:0x034c  */
    /* JADX WARN: Code duplicated, block: B:262:0x0350  */
    /* JADX WARN: Code duplicated, block: B:265:0x035a  */
    /* JADX WARN: Code duplicated, block: B:266:0x035e  */
    /* JADX WARN: Code duplicated, block: B:269:0x0368  */
    /* JADX WARN: Code duplicated, block: B:270:0x036c  */
    /* JADX WARN: Code duplicated, block: B:273:0x0376  */
    /* JADX WARN: Code duplicated, block: B:274:0x037a  */
    /* JADX WARN: Code duplicated, block: B:277:0x0384  */
    /* JADX WARN: Code duplicated, block: B:278:0x0388  */
    /* JADX WARN: Code duplicated, block: B:281:0x0392  */
    /* JADX WARN: Code duplicated, block: B:282:0x0396  */
    /* JADX WARN: Code duplicated, block: B:285:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:286:0x03a4  */
    /* JADX WARN: Code duplicated, block: B:289:0x03ae  */
    /* JADX WARN: Code duplicated, block: B:290:0x03b2  */
    /* JADX WARN: Code duplicated, block: B:293:0x03bc  */
    /* JADX WARN: Code duplicated, block: B:294:0x03c0  */
    /* JADX WARN: Code duplicated, block: B:297:0x03ca  */
    /* JADX WARN: Code duplicated, block: B:298:0x03ce  */
    /* JADX WARN: Code duplicated, block: B:301:0x03d8  */
    /* JADX WARN: Code duplicated, block: B:302:0x03dc  */
    /* JADX WARN: Code duplicated, block: B:305:0x03e6  */
    /* JADX WARN: Code duplicated, block: B:306:0x03ea  */
    /* JADX WARN: Code duplicated, block: B:309:0x03f4  */
    /* JADX WARN: Code duplicated, block: B:310:0x03f8  */
    /* JADX WARN: Code duplicated, block: B:313:0x0402  */
    /* JADX WARN: Code duplicated, block: B:314:0x0406  */
    /* JADX WARN: Code duplicated, block: B:317:0x0410  */
    /* JADX WARN: Code duplicated, block: B:318:0x0414  */
    /* JADX WARN: Code duplicated, block: B:321:0x041e  */
    /* JADX WARN: Code duplicated, block: B:322:0x0422  */
    /* JADX WARN: Code duplicated, block: B:325:0x042c  */
    /* JADX WARN: Code duplicated, block: B:326:0x0430  */
    /* JADX WARN: Code duplicated, block: B:329:0x043a  */
    /* JADX WARN: Code duplicated, block: B:330:0x043e  */
    /* JADX WARN: Code duplicated, block: B:333:0x0448  */
    /* JADX WARN: Code duplicated, block: B:334:0x044c  */
    /* JADX WARN: Code duplicated, block: B:337:0x0456  */
    /* JADX WARN: Code duplicated, block: B:338:0x045a  */
    /* JADX WARN: Code duplicated, block: B:341:0x0464  */
    /* JADX WARN: Code duplicated, block: B:342:0x0468  */
    /* JADX WARN: Code duplicated, block: B:345:0x0472  */
    /* JADX WARN: Code duplicated, block: B:346:0x0476  */
    /* JADX WARN: Code duplicated, block: B:349:0x0480  */
    /* JADX WARN: Code duplicated, block: B:350:0x0484  */
    /* JADX WARN: Code duplicated, block: B:353:0x048e  */
    /* JADX WARN: Code duplicated, block: B:354:0x0492  */
    /* JADX WARN: Code duplicated, block: B:357:0x049c  */
    /* JADX WARN: Code duplicated, block: B:358:0x04a0  */
    /* JADX WARN: Code duplicated, block: B:361:0x04aa  */
    /* JADX WARN: Code duplicated, block: B:362:0x04ae  */
    /* JADX WARN: Code duplicated, block: B:365:0x04b8  */
    /* JADX WARN: Code duplicated, block: B:366:0x04bc  */
    /* JADX WARN: Code duplicated, block: B:369:0x04c6  */
    /* JADX WARN: Code duplicated, block: B:370:0x04ca  */
    /* JADX WARN: Code duplicated, block: B:373:0x04d4  */
    /* JADX WARN: Code duplicated, block: B:374:0x04d8  */
    /* JADX WARN: Code duplicated, block: B:377:0x04e2  */
    /* JADX WARN: Code duplicated, block: B:378:0x04e6  */
    /* JADX WARN: Code duplicated, block: B:381:0x04f0  */
    /* JADX WARN: Code duplicated, block: B:382:0x04f4  */
    /* JADX WARN: Code duplicated, block: B:385:0x04fe  */
    /* JADX WARN: Code duplicated, block: B:386:0x0502  */
    /* JADX WARN: Code duplicated, block: B:389:0x050c  */
    /* JADX WARN: Code duplicated, block: B:390:0x0510  */
    /* JADX WARN: Code duplicated, block: B:393:0x051a  */
    /* JADX WARN: Code duplicated, block: B:394:0x051e  */
    /* JADX WARN: Code duplicated, block: B:397:0x0528  */
    /* JADX WARN: Code duplicated, block: B:398:0x052c  */
    /* JADX WARN: Code duplicated, block: B:401:0x0536  */
    /* JADX WARN: Code duplicated, block: B:402:0x053a  */
    /* JADX WARN: Code duplicated, block: B:405:0x0544  */
    /* JADX WARN: Code duplicated, block: B:406:0x0548  */
    /* JADX WARN: Code duplicated, block: B:409:0x0552  */
    /* JADX WARN: Code duplicated, block: B:410:0x0556  */
    /* JADX WARN: Code duplicated, block: B:413:0x0560  */
    /* JADX WARN: Code duplicated, block: B:414:0x0564  */
    /* JADX WARN: Code duplicated, block: B:417:0x056e  */
    /* JADX WARN: Code duplicated, block: B:418:0x0572  */
    /* JADX WARN: Code duplicated, block: B:421:0x057c  */
    /* JADX WARN: Code duplicated, block: B:422:0x0580  */
    /* JADX WARN: Code duplicated, block: B:425:0x058a  */
    /* JADX WARN: Code duplicated, block: B:426:0x058e  */
    /* JADX WARN: Code duplicated, block: B:429:0x0598  */
    /* JADX WARN: Code duplicated, block: B:430:0x059c  */
    /* JADX WARN: Code duplicated, block: B:433:0x05a6  */
    /* JADX WARN: Code duplicated, block: B:434:0x05aa  */
    /* JADX WARN: Code duplicated, block: B:437:0x05b4  */
    /* JADX WARN: Code duplicated, block: B:438:0x05b8  */
    /* JADX WARN: Code duplicated, block: B:441:0x05c2  */
    /* JADX WARN: Code duplicated, block: B:442:0x05c6  */
    /* JADX WARN: Code duplicated, block: B:445:0x05d0  */
    /* JADX WARN: Code duplicated, block: B:446:0x05d4  */
    /* JADX WARN: Code duplicated, block: B:449:0x05de  */
    /* JADX WARN: Code duplicated, block: B:450:0x05e2  */
    /* JADX WARN: Code duplicated, block: B:453:0x05ec  */
    /* JADX WARN: Code duplicated, block: B:454:0x05f0  */
    /* JADX WARN: Code duplicated, block: B:457:0x05fa  */
    /* JADX WARN: Code duplicated, block: B:458:0x05fe  */
    /* JADX WARN: Code duplicated, block: B:461:0x0608  */
    /* JADX WARN: Code duplicated, block: B:462:0x060c  */
    /* JADX WARN: Code duplicated, block: B:465:0x0616  */
    /* JADX WARN: Code duplicated, block: B:466:0x061a  */
    /* JADX WARN: Code duplicated, block: B:469:0x0624  */
    /* JADX WARN: Code duplicated, block: B:470:0x0628  */
    /* JADX WARN: Code duplicated, block: B:473:0x0632  */
    /* JADX WARN: Code duplicated, block: B:474:0x0636  */
    /* JADX WARN: Code duplicated, block: B:477:0x0640  */
    /* JADX WARN: Code duplicated, block: B:478:0x0644  */
    /* JADX WARN: Code duplicated, block: B:481:0x064e  */
    /* JADX WARN: Code duplicated, block: B:482:0x0652  */
    /* JADX WARN: Code duplicated, block: B:485:0x065c  */
    /* JADX WARN: Code duplicated, block: B:486:0x0660  */
    /* JADX WARN: Code duplicated, block: B:489:0x066a  */
    /* JADX WARN: Code duplicated, block: B:490:0x066e  */
    /* JADX WARN: Code duplicated, block: B:493:0x0678  */
    /* JADX WARN: Code duplicated, block: B:494:0x067c  */
    /* JADX WARN: Code duplicated, block: B:497:0x0686  */
    /* JADX WARN: Code duplicated, block: B:498:0x068a  */
    /* JADX WARN: Code duplicated, block: B:49:0x008d A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:501:0x0694  */
    /* JADX WARN: Code duplicated, block: B:502:0x0698  */
    /* JADX WARN: Code duplicated, block: B:505:0x06a2  */
    /* JADX WARN: Code duplicated, block: B:506:0x06a6  */
    /* JADX WARN: Code duplicated, block: B:509:0x06b0  */
    /* JADX WARN: Code duplicated, block: B:50:0x0090  */
    /* JADX WARN: Code duplicated, block: B:510:0x06b4  */
    /* JADX WARN: Code duplicated, block: B:513:0x06be  */
    /* JADX WARN: Code duplicated, block: B:514:0x06c2  */
    /* JADX WARN: Code duplicated, block: B:517:0x06cc  */
    /* JADX WARN: Code duplicated, block: B:518:0x06d0  */
    /* JADX WARN: Code duplicated, block: B:521:0x06da  */
    /* JADX WARN: Code duplicated, block: B:522:0x06de  */
    /* JADX WARN: Code duplicated, block: B:525:0x06e8  */
    /* JADX WARN: Code duplicated, block: B:526:0x06ec  */
    /* JADX WARN: Code duplicated, block: B:529:0x06f6  */
    /* JADX WARN: Code duplicated, block: B:530:0x06fa  */
    /* JADX WARN: Code duplicated, block: B:533:0x0704  */
    /* JADX WARN: Code duplicated, block: B:534:0x0708  */
    /* JADX WARN: Code duplicated, block: B:537:0x0712  */
    /* JADX WARN: Code duplicated, block: B:538:0x0716  */
    /* JADX WARN: Code duplicated, block: B:541:0x0720  */
    /* JADX WARN: Code duplicated, block: B:542:0x0724  */
    /* JADX WARN: Code duplicated, block: B:545:0x072e  */
    /* JADX WARN: Code duplicated, block: B:546:0x0732  */
    /* JADX WARN: Code duplicated, block: B:549:0x073c  */
    /* JADX WARN: Code duplicated, block: B:552:0x0746  */
    /* JADX WARN: Code duplicated, block: B:553:0x0749  */
    /* JADX WARN: Code duplicated, block: B:556:0x0753  */
    /* JADX WARN: Code duplicated, block: B:557:0x0756  */
    /* JADX WARN: Code duplicated, block: B:55:0x009f A[Catch: all -> 0x08c0, TRY_LEAVE, TryCatch #0 {all -> 0x08c0, blocks: (B:7:0x000f, B:9:0x0013, B:11:0x0023, B:664:0x08bb, B:52:0x0094, B:55:0x009f, B:98:0x011a, B:667:0x08c2), top: B:672:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:560:0x0760  */
    /* JADX WARN: Code duplicated, block: B:561:0x0764  */
    /* JADX WARN: Code duplicated, block: B:564:0x076e  */
    /* JADX WARN: Code duplicated, block: B:565:0x0772  */
    /* JADX WARN: Code duplicated, block: B:568:0x077c  */
    /* JADX WARN: Code duplicated, block: B:569:0x0780  */
    /* JADX WARN: Code duplicated, block: B:572:0x078a  */
    /* JADX WARN: Code duplicated, block: B:573:0x078e  */
    /* JADX WARN: Code duplicated, block: B:576:0x0798  */
    /* JADX WARN: Code duplicated, block: B:577:0x079c  */
    /* JADX WARN: Code duplicated, block: B:580:0x07a6  */
    /* JADX WARN: Code duplicated, block: B:581:0x07aa  */
    /* JADX WARN: Code duplicated, block: B:584:0x07b4  */
    /* JADX WARN: Code duplicated, block: B:585:0x07b8  */
    /* JADX WARN: Code duplicated, block: B:588:0x07c2  */
    /* JADX WARN: Code duplicated, block: B:589:0x07c6  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:592:0x07d0  */
    /* JADX WARN: Code duplicated, block: B:593:0x07d4  */
    /* JADX WARN: Code duplicated, block: B:596:0x07de  */
    /* JADX WARN: Code duplicated, block: B:597:0x07e2  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:600:0x07ec  */
    /* JADX WARN: Code duplicated, block: B:601:0x07f0  */
    /* JADX WARN: Code duplicated, block: B:604:0x07fa  */
    /* JADX WARN: Code duplicated, block: B:605:0x07fe  */
    /* JADX WARN: Code duplicated, block: B:608:0x0808  */
    /* JADX WARN: Code duplicated, block: B:609:0x080c  */
    /* JADX WARN: Code duplicated, block: B:612:0x0816  */
    /* JADX WARN: Code duplicated, block: B:613:0x081a  */
    /* JADX WARN: Code duplicated, block: B:616:0x0824  */
    /* JADX WARN: Code duplicated, block: B:617:0x0828  */
    /* JADX WARN: Code duplicated, block: B:620:0x0832  */
    /* JADX WARN: Code duplicated, block: B:621:0x0836  */
    /* JADX WARN: Code duplicated, block: B:624:0x0840  */
    /* JADX WARN: Code duplicated, block: B:625:0x0844  */
    /* JADX WARN: Code duplicated, block: B:628:0x084e  */
    /* JADX WARN: Code duplicated, block: B:629:0x0851  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:632:0x085b  */
    /* JADX WARN: Code duplicated, block: B:633:0x085d  */
    /* JADX WARN: Code duplicated, block: B:636:0x0867  */
    /* JADX WARN: Code duplicated, block: B:637:0x0869  */
    /* JADX WARN: Code duplicated, block: B:63:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:640:0x0873  */
    /* JADX WARN: Code duplicated, block: B:641:0x0875  */
    /* JADX WARN: Code duplicated, block: B:644:0x087f  */
    /* JADX WARN: Code duplicated, block: B:645:0x0881  */
    /* JADX WARN: Code duplicated, block: B:648:0x088b  */
    /* JADX WARN: Code duplicated, block: B:649:0x088d  */
    /* JADX WARN: Code duplicated, block: B:652:0x0897  */
    /* JADX WARN: Code duplicated, block: B:653:0x0899  */
    /* JADX WARN: Code duplicated, block: B:656:0x08a3  */
    /* JADX WARN: Code duplicated, block: B:657:0x08a5  */
    /* JADX WARN: Code duplicated, block: B:660:0x08af  */
    /* JADX WARN: Code duplicated, block: B:662:0x08b3  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:682:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:683:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:684:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:685:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:686:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:687:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:688:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:689:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:690:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:691:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:692:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:693:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:694:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:695:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:696:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:697:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:698:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:699:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:700:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:701:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:702:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:703:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:704:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:705:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:706:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:707:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:708:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:709:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:710:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:711:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:712:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:713:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:714:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:715:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:716:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:717:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:718:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:719:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:720:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:721:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:722:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:723:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:724:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:725:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:726:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:727:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:728:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:729:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:730:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:731:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:732:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:733:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:734:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:735:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:736:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:737:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:738:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:739:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:740:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:741:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:742:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:743:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:744:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:745:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:746:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:747:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:748:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:749:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x00db  */
    /* JADX WARN: Code duplicated, block: B:750:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:751:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:752:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:753:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:754:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:755:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:756:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:757:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:758:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:759:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:760:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:761:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:762:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:763:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:764:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:765:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:766:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:767:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:768:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:769:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:770:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:771:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:772:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:773:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:774:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:775:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:776:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:777:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:778:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:779:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:780:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:781:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:782:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:783:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:784:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:785:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:786:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:787:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:788:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:789:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:790:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:791:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:792:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:793:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:794:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:795:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:796:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:797:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:798:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:799:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:800:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:801:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:802:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:803:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:804:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:805:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:806:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:807:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:808:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:809:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:810:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:811:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:812:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:813:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:814:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:815:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:816:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:817:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:818:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:819:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:820:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:821:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:822:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:823:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:824:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:825:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:826:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:827:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:828:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:829:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:830:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:86:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:87:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:90:0x0107  */
    /* JADX WARN: Code duplicated, block: B:91:0x0109  */
    /* JADX WARN: Code duplicated, block: B:94:0x0112  */
    /* JADX WARN: Code duplicated, block: B:96:0x0116  */
    /* JADX WARN: Code duplicated, block: B:98:0x011a A[Catch: all -> 0x08c0, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x08c0, blocks: (B:7:0x000f, B:9:0x0013, B:11:0x0023, B:664:0x08bb, B:52:0x0094, B:55:0x009f, B:98:0x011a, B:667:0x08c2), top: B:672:0x000f }] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: U0 */
    public static boolean m800U0(String str) {
        String str2;
        byte b;
        String str3;
        byte b2;
        boolean z = false;
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (C0068b.class) {
            try {
                if (!f1030d3) {
                    HashSet hashSet = dgd0.f48781a;
                    int i = Build.VERSION.SDK_INT;
                    byte b3 = 28;
                    if (i <= 28) {
                        String str4 = Build.DEVICE;
                        str4.getClass();
                        switch (str4.hashCode()) {
                            case -1339091551:
                                b2 = !str4.equals("dangal") ? (byte) -1 : (byte) 0;
                                break;
                            case -1220081023:
                                b2 = !str4.equals("dangalFHD") ? (byte) -1 : (byte) 1;
                                break;
                            case -1220066608:
                                b2 = !str4.equals("dangalUHD") ? (byte) -1 : (byte) 2;
                                break;
                            case -1012436106:
                                b2 = !str4.equals("oneday") ? (byte) -1 : (byte) 3;
                                break;
                            case -760312546:
                                b2 = !str4.equals("aquaman") ? (byte) -1 : (byte) 4;
                                break;
                            case -64886864:
                                b2 = !str4.equals("magnolia") ? (byte) -1 : (byte) 5;
                                break;
                            case 3415681:
                                b2 = !str4.equals("once") ? (byte) -1 : (byte) 6;
                                break;
                            case 825323514:
                                b2 = !str4.equals("machuca") ? (byte) -1 : (byte) 7;
                                break;
                            default:
                                b2 = -1;
                                break;
                        }
                        switch (b2) {
                            default:
                                if (i <= 27 || !"HWEML".equals(Build.DEVICE)) {
                                    str2 = Build.MODEL;
                                    str2.getClass();
                                    switch (str2.hashCode()) {
                                        case -349662828:
                                            if (!str2.equals("AFTJMST12")) {
                                                b = 0;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        case -321033677:
                                            if (!str2.equals("AFTKMST12")) {
                                                b = 1;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        case 2006354:
                                            if (!str2.equals("AFTA")) {
                                                b = 2;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        case 2006367:
                                            if (!str2.equals("AFTN")) {
                                                b = 3;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        case 2006371:
                                            if (!str2.equals("AFTR")) {
                                                b = 4;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        case 1785421873:
                                            if (!str2.equals("AFTEU011")) {
                                                b = 5;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        case 1785421876:
                                            if (!str2.equals("AFTEU014")) {
                                                b = 6;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        case 1798172390:
                                            if (!str2.equals("AFTSO001")) {
                                                b = 7;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        case 2119412532:
                                            if (!str2.equals("AFTEUFF014")) {
                                                b = 8;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        default:
                                            b = -1;
                                            break;
                                    }
                                    switch (b) {
                                        default:
                                            if (i <= 26) {
                                                str3 = Build.DEVICE;
                                                str3.getClass();
                                                switch (str3.hashCode()) {
                                                    case -2144781245:
                                                        if (!str3.equals("GIONEE_SWW1609")) {
                                                            b3 = 0;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -2144781185:
                                                        if (!str3.equals("GIONEE_SWW1627")) {
                                                            b3 = 1;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -2144781160:
                                                        if (!str3.equals("GIONEE_SWW1631")) {
                                                            b3 = 2;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -2097309513:
                                                        if (!str3.equals("K50a40")) {
                                                            b3 = 3;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -2022874474:
                                                        if (!str3.equals("CP8676_I02")) {
                                                            b3 = 4;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -1978993182:
                                                        if (!str3.equals("NX541J")) {
                                                            b3 = 5;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -1978990237:
                                                        if (!str3.equals("NX573J")) {
                                                            b3 = 6;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -1936688988:
                                                        if (!str3.equals("PGN528")) {
                                                            b3 = 7;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -1936688066:
                                                        if (!str3.equals("PGN610")) {
                                                            b3 = 8;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -1936688065:
                                                        if (!str3.equals("PGN611")) {
                                                            b3 = 9;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -1931988508:
                                                        if (!str3.equals("AquaPowerM")) {
                                                            b3 = 10;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -1885099851:
                                                        if (!str3.equals("RAIJIN")) {
                                                            b3 = 11;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -1696512866:
                                                        if (!str3.equals("XT1663")) {
                                                            b3 = 12;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -1680025915:
                                                        if (!str3.equals("ComioS1")) {
                                                            b3 = 13;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -1615810839:
                                                        if (!str3.equals("Phantom6")) {
                                                            b3 = 14;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -1600724499:
                                                        if (!str3.equals("pacificrim")) {
                                                            b3 = 15;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -1554255044:
                                                        if (!str3.equals("vernee_M5")) {
                                                            b3 = 16;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -1481772737:
                                                        if (!str3.equals("panell_dl")) {
                                                            b3 = 17;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -1481772730:
                                                        if (!str3.equals("panell_ds")) {
                                                            b3 = 18;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -1481772729:
                                                        if (!str3.equals("panell_dt")) {
                                                            b3 = 19;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -1320080169:
                                                        if (!str3.equals("GiONEE_GBL7319")) {
                                                            b3 = 20;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -1217592143:
                                                        if (!str3.equals("BRAVIA_ATV2")) {
                                                            b3 = 21;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -1180384755:
                                                        if (!str3.equals("iris60")) {
                                                            b3 = 22;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -1139198265:
                                                        if (!str3.equals("Slate_Pro")) {
                                                            b3 = 23;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -1052835013:
                                                        if (!str3.equals("namath")) {
                                                            b3 = 24;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -993250464:
                                                        if (!str3.equals("A10-70F")) {
                                                            b3 = 25;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -993250458:
                                                        if (!str3.equals("A10-70L")) {
                                                            b3 = 26;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -965403638:
                                                        if (!str3.equals("s905x018")) {
                                                            b3 = 27;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -958336948:
                                                        if (!str3.equals("ELUGA_Ray_X")) {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -879245230:
                                                        if (!str3.equals("tcl_eu")) {
                                                            b3 = 29;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -842500323:
                                                        if (!str3.equals("nicklaus_f")) {
                                                            b3 = 30;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -821392978:
                                                        if (!str3.equals("A7000-a")) {
                                                            b3 = 31;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -797483286:
                                                        if (!str3.equals("SVP-DTV15")) {
                                                            b3 = 32;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -794946968:
                                                        if (!str3.equals("watson")) {
                                                            b3 = 33;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -788334647:
                                                        if (!str3.equals("whyred")) {
                                                            b3 = 34;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -782144577:
                                                        if (!str3.equals("OnePlus5T")) {
                                                            b3 = 35;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -575125681:
                                                        if (!str3.equals("GiONEE_CBL7513")) {
                                                            b3 = 36;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -521118391:
                                                        if (!str3.equals("GIONEE_GBL7360")) {
                                                            b3 = 37;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -430914369:
                                                        if (!str3.equals("Pixi4-7_3G")) {
                                                            b3 = 38;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -290434366:
                                                        if (!str3.equals("taido_row")) {
                                                            b3 = 39;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -282781963:
                                                        if (!str3.equals("BLACK-1X")) {
                                                            b3 = 40;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -277133239:
                                                        if (!str3.equals("Z12_PRO")) {
                                                            b3 = 41;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -173639913:
                                                        if (!str3.equals("ELUGA_A3_Pro")) {
                                                            b3 = 42;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -56598463:
                                                        if (!str3.equals("woods_fn")) {
                                                            b3 = 43;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 2126:
                                                        if (!str3.equals("C1")) {
                                                            b3 = 44;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 2564:
                                                        if (!str3.equals("Q5")) {
                                                            b3 = 45;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 2715:
                                                        if (!str3.equals("V1")) {
                                                            b3 = 46;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 2719:
                                                        if (!str3.equals("V5")) {
                                                            b3 = 47;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 3091:
                                                        if (!str3.equals("b5")) {
                                                            b3 = 48;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 3483:
                                                        if (!str3.equals("mh")) {
                                                            b3 = 49;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 73405:
                                                        if (!str3.equals("JGZ")) {
                                                            b3 = 50;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 75537:
                                                        if (!str3.equals("M04")) {
                                                            b3 = 51;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 75739:
                                                        if (!str3.equals("M5c")) {
                                                            b3 = 52;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 76779:
                                                        if (!str3.equals("MX6")) {
                                                            b3 = 53;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 78669:
                                                        if (!str3.equals("P85")) {
                                                            b3 = 54;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 79305:
                                                        if (!str3.equals("PLE")) {
                                                            b3 = 55;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 80618:
                                                        if (!str3.equals("QX1")) {
                                                            b3 = 56;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 88274:
                                                        if (!str3.equals("Z80")) {
                                                            b3 = 57;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 98846:
                                                        if (!str3.equals("cv1")) {
                                                            b3 = 58;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 98848:
                                                        if (!str3.equals("cv3")) {
                                                            b3 = 59;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 99329:
                                                        if (!str3.equals("deb")) {
                                                            b3 = 60;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 101481:
                                                        if (!str3.equals("flo")) {
                                                            b3 = 61;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 1513190:
                                                        if (!str3.equals("1601")) {
                                                            b3 = 62;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 1514184:
                                                        if (!str3.equals("1713")) {
                                                            b3 = 63;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 1514185:
                                                        if (!str3.equals("1714")) {
                                                            b3 = 64;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 2133089:
                                                        if (!str3.equals("F01H")) {
                                                            b3 = 65;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 2133091:
                                                        if (!str3.equals("F01J")) {
                                                            b3 = 66;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 2133120:
                                                        if (!str3.equals("F02H")) {
                                                            b3 = 67;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 2133151:
                                                        if (!str3.equals("F03H")) {
                                                            b3 = 68;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 2133182:
                                                        if (!str3.equals("F04H")) {
                                                            b3 = 69;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 2133184:
                                                        if (!str3.equals("F04J")) {
                                                            b3 = 70;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 2436959:
                                                        if (!str3.equals("P681")) {
                                                            b3 = 71;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 2463773:
                                                        if (!str3.equals("Q350")) {
                                                            b3 = 72;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 2464648:
                                                        if (!str3.equals("Q427")) {
                                                            b3 = 73;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 2689555:
                                                        if (!str3.equals("XE2X")) {
                                                            b3 = 74;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 3154429:
                                                        if (!str3.equals("fugu")) {
                                                            b3 = 75;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 3284551:
                                                        if (!str3.equals("kate")) {
                                                            b3 = 76;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 3351335:
                                                        if (!str3.equals("mido")) {
                                                            b3 = 77;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 3386211:
                                                        if (!str3.equals("p212")) {
                                                            b3 = 78;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 41325051:
                                                        if (!str3.equals("MEIZU_M5")) {
                                                            b3 = 79;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 51349633:
                                                        if (!str3.equals("601LV")) {
                                                            b3 = 80;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 51350594:
                                                        if (!str3.equals("602LV")) {
                                                            b3 = 81;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 55178625:
                                                        if (!str3.equals("Aura_Note_2")) {
                                                            b3 = 82;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 61542055:
                                                        if (!str3.equals("A1601")) {
                                                            b3 = 83;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 65355429:
                                                        if (!str3.equals("E5643")) {
                                                            b3 = 84;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 66214468:
                                                        if (!str3.equals("F3111")) {
                                                            b3 = 85;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 66214470:
                                                        if (!str3.equals("F3113")) {
                                                            b3 = 86;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 66214473:
                                                        if (!str3.equals("F3116")) {
                                                            b3 = 87;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 66215429:
                                                        if (!str3.equals("F3211")) {
                                                            b3 = 88;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 66215431:
                                                        if (!str3.equals("F3213")) {
                                                            b3 = 89;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 66215433:
                                                        if (!str3.equals("F3215")) {
                                                            b3 = 90;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 66216390:
                                                        if (!str3.equals("F3311")) {
                                                            b3 = 91;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 76402249:
                                                        if (!str3.equals("PRO7S")) {
                                                            b3 = 92;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 76404105:
                                                        if (!str3.equals("Q4260")) {
                                                            b3 = 93;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 76404911:
                                                        if (!str3.equals("Q4310")) {
                                                            b3 = 94;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 80963634:
                                                        if (!str3.equals("V23GB")) {
                                                            b3 = 95;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 82882791:
                                                        if (!str3.equals("X3_HK")) {
                                                            b3 = 96;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 98715550:
                                                        if (!str3.equals("i9031")) {
                                                            b3 = 97;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 101370885:
                                                        if (!str3.equals("l5460")) {
                                                            b3 = 98;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 102844228:
                                                        if (!str3.equals("le_x6")) {
                                                            b3 = 99;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 165221241:
                                                        if (!str3.equals("A2016a40")) {
                                                            b3 = 100;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 182191441:
                                                        if (!str3.equals("CPY83_I00")) {
                                                            b3 = 101;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 245388979:
                                                        if (!str3.equals("marino_f")) {
                                                            b3 = 102;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 287431619:
                                                        if (!str3.equals("griffin")) {
                                                            b3 = 103;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 307593612:
                                                        if (!str3.equals("A7010a48")) {
                                                            b3 = 104;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 308517133:
                                                        if (!str3.equals("A7020a48")) {
                                                            b3 = 105;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 316215098:
                                                        if (!str3.equals("TB3-730F")) {
                                                            b3 = 106;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 316215116:
                                                        if (!str3.equals("TB3-730X")) {
                                                            b3 = 107;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 316246811:
                                                        if (!str3.equals("TB3-850F")) {
                                                            b3 = 108;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 316246818:
                                                        if (!str3.equals("TB3-850M")) {
                                                            b3 = 109;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 407160593:
                                                        if (!str3.equals("Pixi5-10_4G")) {
                                                            b3 = 110;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 507412548:
                                                        if (!str3.equals("QM16XE_U")) {
                                                            b3 = 111;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 793982701:
                                                        if (!str3.equals("GIONEE_WBL5708")) {
                                                            b3 = 112;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 794038622:
                                                        if (!str3.equals("GIONEE_WBL7365")) {
                                                            b3 = 113;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 794040393:
                                                        if (!str3.equals("GIONEE_WBL7519")) {
                                                            b3 = 114;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 835649806:
                                                        if (!str3.equals("manning")) {
                                                            b3 = 115;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 917340916:
                                                        if (!str3.equals("A7000plus")) {
                                                            b3 = 116;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 958008161:
                                                        if (!str3.equals("j2xlteins")) {
                                                            b3 = 117;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 1060579533:
                                                        if (!str3.equals("panell_d")) {
                                                            b3 = 118;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 1150207623:
                                                        if (!str3.equals("LS-5017")) {
                                                            b3 = 119;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 1176899427:
                                                        if (!str3.equals("itel_S41")) {
                                                            b3 = 120;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 1280332038:
                                                        if (!str3.equals("hwALE-H")) {
                                                            b3 = 121;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 1306947716:
                                                        if (!str3.equals("EverStar_S")) {
                                                            b3 = 122;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 1349174697:
                                                        if (!str3.equals("htc_e56ml_dtul")) {
                                                            b3 = 123;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 1522194893:
                                                        if (!str3.equals("woods_f")) {
                                                            b3 = 124;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 1691543273:
                                                        if (!str3.equals("CPH1609")) {
                                                            b3 = 125;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 1691544261:
                                                        if (!str3.equals("CPH1715")) {
                                                            b3 = 126;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 1709443163:
                                                        if (!str3.equals("iball8735_9806")) {
                                                            b3 = 127;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 1865889110:
                                                        if (!str3.equals("santoni")) {
                                                            b3 = 128;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 1906253259:
                                                        if (!str3.equals("PB2-670M")) {
                                                            b3 = 129;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 1977196784:
                                                        if (!str3.equals("Infinix-X572")) {
                                                            b3 = 130;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 2006372676:
                                                        if (!str3.equals("BRAVIA_ATV3_4K")) {
                                                            b3 = 131;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 2019281702:
                                                        if (!str3.equals("DM-01K")) {
                                                            b3 = 132;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 2029784656:
                                                        if (!str3.equals("HWBLN-H")) {
                                                            b3 = 133;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 2030379515:
                                                        if (!str3.equals("HWCAM-H")) {
                                                            b3 = 134;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 2033393791:
                                                        if (!str3.equals("ASUS_X00AD_2")) {
                                                            b3 = 135;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 2047190025:
                                                        if (!str3.equals("ELUGA_Note")) {
                                                            b3 = 136;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 2047252157:
                                                        if (!str3.equals("ELUGA_Prim")) {
                                                            b3 = 137;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 2048319463:
                                                        if (!str3.equals("HWVNS-H")) {
                                                            b3 = 138;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 2048855701:
                                                        if (!str3.equals("HWWAS-H")) {
                                                            b3 = 139;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    default:
                                                        b3 = -1;
                                                        break;
                                                }
                                                switch (b3) {
                                                    default:
                                                        if (str2.equals("JSN-L21")) {
                                                        }
                                                    case 0:
                                                    case 1:
                                                    case 2:
                                                    case 3:
                                                    case 4:
                                                    case 5:
                                                    case 6:
                                                    case 7:
                                                    case 8:
                                                    case 9:
                                                    case 10:
                                                    case 11:
                                                    case 12:
                                                    case 13:
                                                    case 14:
                                                    case 15:
                                                    case 16:
                                                    case 17:
                                                    case 18:
                                                    case 19:
                                                    case 20:
                                                    case 21:
                                                    case 22:
                                                    case 23:
                                                    case 24:
                                                    case 25:
                                                    case 26:
                                                    case 27:
                                                    case 28:
                                                    case 29:
                                                    case 30:
                                                    case 31:
                                                    case 32:
                                                    case 33:
                                                    case 34:
                                                    case 35:
                                                    case 36:
                                                    case 37:
                                                    case 38:
                                                    case 39:
                                                    case 40:
                                                    case 41:
                                                    case 42:
                                                    case 43:
                                                    case 44:
                                                    case 45:
                                                    case 46:
                                                    case 47:
                                                    case 48:
                                                    case 49:
                                                    case 50:
                                                    case 51:
                                                    case 52:
                                                    case 53:
                                                    case 54:
                                                    case 55:
                                                    case 56:
                                                    case 57:
                                                    case 58:
                                                    case PlaylistDecorationPolicy.TAG_MANIFEST_FIELD_NUMBER /* 59 */:
                                                    case 60:
                                                    case 61:
                                                    case 62:
                                                    case 63:
                                                    case 64:
                                                    case 65:
                                                    case 66:
                                                    case 67:
                                                    case 68:
                                                    case 69:
                                                    case 70:
                                                    case 71:
                                                    case 72:
                                                    case 73:
                                                    case 74:
                                                    case 75:
                                                    case 76:
                                                    case 77:
                                                    case 78:
                                                    case 79:
                                                    case 80:
                                                    case 81:
                                                    case 82:
                                                    case 83:
                                                    case 84:
                                                    case 85:
                                                    case Metadata$Episode.RSS_GUID_FIELD_NUMBER /* 86 */:
                                                    case 87:
                                                    case Metadata$Episode.SEASON_NUMBER_FIELD_NUMBER /* 88 */:
                                                    case 89:
                                                    case 90:
                                                    case 91:
                                                    case 92:
                                                    case 93:
                                                    case 94:
                                                    case 95:
                                                    case 96:
                                                    case com.spotify.metadata.proto.Metadata$Episode.IS_PODCAST_SHORT_FIELD_NUMBER /* 97 */:
                                                    case 98:
                                                    case 99:
                                                    case 100:
                                                    case 101:
                                                    case 102:
                                                    case 103:
                                                    case 104:
                                                    case 105:
                                                    case Error.INVALID_COUNTRY_FIELD_NUMBER /* 106 */:
                                                    case Error.TOO_YOUNG_FIELD_NUMBER /* 107 */:
                                                    case 108:
                                                    case 109:
                                                    case 110:
                                                    case ContentType.SHORT_FORM_ON_DEMAND /* 111 */:
                                                    case ContentType.LONG_FORM_ON_DEMAND /* 112 */:
                                                    case ContentType.LIVE /* 113 */:
                                                    case 114:
                                                    case 115:
                                                    case 116:
                                                    case 117:
                                                    case 118:
                                                    case 119:
                                                    case 120:
                                                    case ContentType.USER_GENERATED_SHORT_FORM_ON_DEMAND /* 121 */:
                                                    case ContentType.USER_GENERATED_LONG_FORM_ON_DEMAND /* 122 */:
                                                    case ContentType.USER_GENERATED_LIVE /* 123 */:
                                                    case 124:
                                                    case 125:
                                                    case 126:
                                                    case 127:
                                                    case 128:
                                                    case 129:
                                                    case 130:
                                                    case 131:
                                                    case 132:
                                                    case 133:
                                                    case 134:
                                                    case 135:
                                                    case 136:
                                                    case 137:
                                                    case 138:
                                                    case 139:
                                                        z = true;
                                                        break;
                                                }
                                            }
                                        case 0:
                                        case 1:
                                        case 2:
                                        case 3:
                                        case 4:
                                        case 5:
                                        case 6:
                                        case 7:
                                        case 8:
                                            z = true;
                                            break;
                                    }
                                }
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                                z = true;
                                break;
                        }
                    } else if (i <= 27) {
                        str2 = Build.MODEL;
                        str2.getClass();
                        switch (str2.hashCode()) {
                            case -349662828:
                                if (!str2.equals("AFTJMST12")) {
                                    b = 0;
                                } else {
                                    b = -1;
                                }
                                break;
                            case -321033677:
                                if (!str2.equals("AFTKMST12")) {
                                    b = 1;
                                } else {
                                    b = -1;
                                }
                                break;
                            case 2006354:
                                if (!str2.equals("AFTA")) {
                                    b = 2;
                                } else {
                                    b = -1;
                                }
                                break;
                            case 2006367:
                                if (!str2.equals("AFTN")) {
                                    b = 3;
                                } else {
                                    b = -1;
                                }
                                break;
                            case 2006371:
                                if (!str2.equals("AFTR")) {
                                    b = 4;
                                } else {
                                    b = -1;
                                }
                                break;
                            case 1785421873:
                                if (!str2.equals("AFTEU011")) {
                                    b = 5;
                                } else {
                                    b = -1;
                                }
                                break;
                            case 1785421876:
                                if (!str2.equals("AFTEU014")) {
                                    b = 6;
                                } else {
                                    b = -1;
                                }
                                break;
                            case 1798172390:
                                if (!str2.equals("AFTSO001")) {
                                    b = 7;
                                } else {
                                    b = -1;
                                }
                                break;
                            case 2119412532:
                                if (!str2.equals("AFTEUFF014")) {
                                    b = 8;
                                } else {
                                    b = -1;
                                }
                                break;
                            default:
                                b = -1;
                                break;
                        }
                        switch (b) {
                            default:
                                if (i <= 26) {
                                    str3 = Build.DEVICE;
                                    str3.getClass();
                                    switch (str3.hashCode()) {
                                        case -2144781245:
                                            if (!str3.equals("GIONEE_SWW1609")) {
                                                b3 = 0;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -2144781185:
                                            if (!str3.equals("GIONEE_SWW1627")) {
                                                b3 = 1;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -2144781160:
                                            if (!str3.equals("GIONEE_SWW1631")) {
                                                b3 = 2;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -2097309513:
                                            if (!str3.equals("K50a40")) {
                                                b3 = 3;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -2022874474:
                                            if (!str3.equals("CP8676_I02")) {
                                                b3 = 4;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -1978993182:
                                            if (!str3.equals("NX541J")) {
                                                b3 = 5;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -1978990237:
                                            if (!str3.equals("NX573J")) {
                                                b3 = 6;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -1936688988:
                                            if (!str3.equals("PGN528")) {
                                                b3 = 7;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -1936688066:
                                            if (!str3.equals("PGN610")) {
                                                b3 = 8;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -1936688065:
                                            if (!str3.equals("PGN611")) {
                                                b3 = 9;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -1931988508:
                                            if (!str3.equals("AquaPowerM")) {
                                                b3 = 10;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -1885099851:
                                            if (!str3.equals("RAIJIN")) {
                                                b3 = 11;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -1696512866:
                                            if (!str3.equals("XT1663")) {
                                                b3 = 12;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -1680025915:
                                            if (!str3.equals("ComioS1")) {
                                                b3 = 13;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -1615810839:
                                            if (!str3.equals("Phantom6")) {
                                                b3 = 14;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -1600724499:
                                            if (!str3.equals("pacificrim")) {
                                                b3 = 15;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -1554255044:
                                            if (!str3.equals("vernee_M5")) {
                                                b3 = 16;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -1481772737:
                                            if (!str3.equals("panell_dl")) {
                                                b3 = 17;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -1481772730:
                                            if (!str3.equals("panell_ds")) {
                                                b3 = 18;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -1481772729:
                                            if (!str3.equals("panell_dt")) {
                                                b3 = 19;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -1320080169:
                                            if (!str3.equals("GiONEE_GBL7319")) {
                                                b3 = 20;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -1217592143:
                                            if (!str3.equals("BRAVIA_ATV2")) {
                                                b3 = 21;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -1180384755:
                                            if (!str3.equals("iris60")) {
                                                b3 = 22;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -1139198265:
                                            if (!str3.equals("Slate_Pro")) {
                                                b3 = 23;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -1052835013:
                                            if (!str3.equals("namath")) {
                                                b3 = 24;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -993250464:
                                            if (!str3.equals("A10-70F")) {
                                                b3 = 25;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -993250458:
                                            if (!str3.equals("A10-70L")) {
                                                b3 = 26;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -965403638:
                                            if (!str3.equals("s905x018")) {
                                                b3 = 27;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -958336948:
                                            if (!str3.equals("ELUGA_Ray_X")) {
                                                b3 = -1;
                                            }
                                            break;
                                        case -879245230:
                                            if (!str3.equals("tcl_eu")) {
                                                b3 = 29;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -842500323:
                                            if (!str3.equals("nicklaus_f")) {
                                                b3 = 30;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -821392978:
                                            if (!str3.equals("A7000-a")) {
                                                b3 = 31;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -797483286:
                                            if (!str3.equals("SVP-DTV15")) {
                                                b3 = 32;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -794946968:
                                            if (!str3.equals("watson")) {
                                                b3 = 33;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -788334647:
                                            if (!str3.equals("whyred")) {
                                                b3 = 34;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -782144577:
                                            if (!str3.equals("OnePlus5T")) {
                                                b3 = 35;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -575125681:
                                            if (!str3.equals("GiONEE_CBL7513")) {
                                                b3 = 36;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -521118391:
                                            if (!str3.equals("GIONEE_GBL7360")) {
                                                b3 = 37;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -430914369:
                                            if (!str3.equals("Pixi4-7_3G")) {
                                                b3 = 38;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -290434366:
                                            if (!str3.equals("taido_row")) {
                                                b3 = 39;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -282781963:
                                            if (!str3.equals("BLACK-1X")) {
                                                b3 = 40;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -277133239:
                                            if (!str3.equals("Z12_PRO")) {
                                                b3 = 41;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -173639913:
                                            if (!str3.equals("ELUGA_A3_Pro")) {
                                                b3 = 42;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -56598463:
                                            if (!str3.equals("woods_fn")) {
                                                b3 = 43;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 2126:
                                            if (!str3.equals("C1")) {
                                                b3 = 44;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 2564:
                                            if (!str3.equals("Q5")) {
                                                b3 = 45;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 2715:
                                            if (!str3.equals("V1")) {
                                                b3 = 46;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 2719:
                                            if (!str3.equals("V5")) {
                                                b3 = 47;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 3091:
                                            if (!str3.equals("b5")) {
                                                b3 = 48;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 3483:
                                            if (!str3.equals("mh")) {
                                                b3 = 49;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 73405:
                                            if (!str3.equals("JGZ")) {
                                                b3 = 50;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 75537:
                                            if (!str3.equals("M04")) {
                                                b3 = 51;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 75739:
                                            if (!str3.equals("M5c")) {
                                                b3 = 52;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 76779:
                                            if (!str3.equals("MX6")) {
                                                b3 = 53;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 78669:
                                            if (!str3.equals("P85")) {
                                                b3 = 54;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 79305:
                                            if (!str3.equals("PLE")) {
                                                b3 = 55;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 80618:
                                            if (!str3.equals("QX1")) {
                                                b3 = 56;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 88274:
                                            if (!str3.equals("Z80")) {
                                                b3 = 57;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 98846:
                                            if (!str3.equals("cv1")) {
                                                b3 = 58;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 98848:
                                            if (!str3.equals("cv3")) {
                                                b3 = 59;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 99329:
                                            if (!str3.equals("deb")) {
                                                b3 = 60;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 101481:
                                            if (!str3.equals("flo")) {
                                                b3 = 61;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 1513190:
                                            if (!str3.equals("1601")) {
                                                b3 = 62;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 1514184:
                                            if (!str3.equals("1713")) {
                                                b3 = 63;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 1514185:
                                            if (!str3.equals("1714")) {
                                                b3 = 64;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 2133089:
                                            if (!str3.equals("F01H")) {
                                                b3 = 65;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 2133091:
                                            if (!str3.equals("F01J")) {
                                                b3 = 66;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 2133120:
                                            if (!str3.equals("F02H")) {
                                                b3 = 67;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 2133151:
                                            if (!str3.equals("F03H")) {
                                                b3 = 68;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 2133182:
                                            if (!str3.equals("F04H")) {
                                                b3 = 69;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 2133184:
                                            if (!str3.equals("F04J")) {
                                                b3 = 70;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 2436959:
                                            if (!str3.equals("P681")) {
                                                b3 = 71;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 2463773:
                                            if (!str3.equals("Q350")) {
                                                b3 = 72;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 2464648:
                                            if (!str3.equals("Q427")) {
                                                b3 = 73;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 2689555:
                                            if (!str3.equals("XE2X")) {
                                                b3 = 74;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 3154429:
                                            if (!str3.equals("fugu")) {
                                                b3 = 75;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 3284551:
                                            if (!str3.equals("kate")) {
                                                b3 = 76;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 3351335:
                                            if (!str3.equals("mido")) {
                                                b3 = 77;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 3386211:
                                            if (!str3.equals("p212")) {
                                                b3 = 78;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 41325051:
                                            if (!str3.equals("MEIZU_M5")) {
                                                b3 = 79;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 51349633:
                                            if (!str3.equals("601LV")) {
                                                b3 = 80;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 51350594:
                                            if (!str3.equals("602LV")) {
                                                b3 = 81;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 55178625:
                                            if (!str3.equals("Aura_Note_2")) {
                                                b3 = 82;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 61542055:
                                            if (!str3.equals("A1601")) {
                                                b3 = 83;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 65355429:
                                            if (!str3.equals("E5643")) {
                                                b3 = 84;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 66214468:
                                            if (!str3.equals("F3111")) {
                                                b3 = 85;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 66214470:
                                            if (!str3.equals("F3113")) {
                                                b3 = 86;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 66214473:
                                            if (!str3.equals("F3116")) {
                                                b3 = 87;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 66215429:
                                            if (!str3.equals("F3211")) {
                                                b3 = 88;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 66215431:
                                            if (!str3.equals("F3213")) {
                                                b3 = 89;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 66215433:
                                            if (!str3.equals("F3215")) {
                                                b3 = 90;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 66216390:
                                            if (!str3.equals("F3311")) {
                                                b3 = 91;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 76402249:
                                            if (!str3.equals("PRO7S")) {
                                                b3 = 92;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 76404105:
                                            if (!str3.equals("Q4260")) {
                                                b3 = 93;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 76404911:
                                            if (!str3.equals("Q4310")) {
                                                b3 = 94;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 80963634:
                                            if (!str3.equals("V23GB")) {
                                                b3 = 95;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 82882791:
                                            if (!str3.equals("X3_HK")) {
                                                b3 = 96;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 98715550:
                                            if (!str3.equals("i9031")) {
                                                b3 = 97;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 101370885:
                                            if (!str3.equals("l5460")) {
                                                b3 = 98;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 102844228:
                                            if (!str3.equals("le_x6")) {
                                                b3 = 99;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 165221241:
                                            if (!str3.equals("A2016a40")) {
                                                b3 = 100;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 182191441:
                                            if (!str3.equals("CPY83_I00")) {
                                                b3 = 101;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 245388979:
                                            if (!str3.equals("marino_f")) {
                                                b3 = 102;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 287431619:
                                            if (!str3.equals("griffin")) {
                                                b3 = 103;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 307593612:
                                            if (!str3.equals("A7010a48")) {
                                                b3 = 104;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 308517133:
                                            if (!str3.equals("A7020a48")) {
                                                b3 = 105;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 316215098:
                                            if (!str3.equals("TB3-730F")) {
                                                b3 = 106;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 316215116:
                                            if (!str3.equals("TB3-730X")) {
                                                b3 = 107;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 316246811:
                                            if (!str3.equals("TB3-850F")) {
                                                b3 = 108;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 316246818:
                                            if (!str3.equals("TB3-850M")) {
                                                b3 = 109;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 407160593:
                                            if (!str3.equals("Pixi5-10_4G")) {
                                                b3 = 110;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 507412548:
                                            if (!str3.equals("QM16XE_U")) {
                                                b3 = 111;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 793982701:
                                            if (!str3.equals("GIONEE_WBL5708")) {
                                                b3 = 112;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 794038622:
                                            if (!str3.equals("GIONEE_WBL7365")) {
                                                b3 = 113;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 794040393:
                                            if (!str3.equals("GIONEE_WBL7519")) {
                                                b3 = 114;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 835649806:
                                            if (!str3.equals("manning")) {
                                                b3 = 115;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 917340916:
                                            if (!str3.equals("A7000plus")) {
                                                b3 = 116;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 958008161:
                                            if (!str3.equals("j2xlteins")) {
                                                b3 = 117;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 1060579533:
                                            if (!str3.equals("panell_d")) {
                                                b3 = 118;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 1150207623:
                                            if (!str3.equals("LS-5017")) {
                                                b3 = 119;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 1176899427:
                                            if (!str3.equals("itel_S41")) {
                                                b3 = 120;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 1280332038:
                                            if (!str3.equals("hwALE-H")) {
                                                b3 = 121;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 1306947716:
                                            if (!str3.equals("EverStar_S")) {
                                                b3 = 122;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 1349174697:
                                            if (!str3.equals("htc_e56ml_dtul")) {
                                                b3 = 123;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 1522194893:
                                            if (!str3.equals("woods_f")) {
                                                b3 = 124;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 1691543273:
                                            if (!str3.equals("CPH1609")) {
                                                b3 = 125;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 1691544261:
                                            if (!str3.equals("CPH1715")) {
                                                b3 = 126;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 1709443163:
                                            if (!str3.equals("iball8735_9806")) {
                                                b3 = 127;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 1865889110:
                                            if (!str3.equals("santoni")) {
                                                b3 = 128;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 1906253259:
                                            if (!str3.equals("PB2-670M")) {
                                                b3 = 129;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 1977196784:
                                            if (!str3.equals("Infinix-X572")) {
                                                b3 = 130;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 2006372676:
                                            if (!str3.equals("BRAVIA_ATV3_4K")) {
                                                b3 = 131;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 2019281702:
                                            if (!str3.equals("DM-01K")) {
                                                b3 = 132;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 2029784656:
                                            if (!str3.equals("HWBLN-H")) {
                                                b3 = 133;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 2030379515:
                                            if (!str3.equals("HWCAM-H")) {
                                                b3 = 134;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 2033393791:
                                            if (!str3.equals("ASUS_X00AD_2")) {
                                                b3 = 135;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 2047190025:
                                            if (!str3.equals("ELUGA_Note")) {
                                                b3 = 136;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 2047252157:
                                            if (!str3.equals("ELUGA_Prim")) {
                                                b3 = 137;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 2048319463:
                                            if (!str3.equals("HWVNS-H")) {
                                                b3 = 138;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 2048855701:
                                            if (!str3.equals("HWWAS-H")) {
                                                b3 = 139;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        default:
                                            b3 = -1;
                                            break;
                                    }
                                    switch (b3) {
                                        default:
                                            if (str2.equals("JSN-L21")) {
                                            }
                                        case 0:
                                        case 1:
                                        case 2:
                                        case 3:
                                        case 4:
                                        case 5:
                                        case 6:
                                        case 7:
                                        case 8:
                                        case 9:
                                        case 10:
                                        case 11:
                                        case 12:
                                        case 13:
                                        case 14:
                                        case 15:
                                        case 16:
                                        case 17:
                                        case 18:
                                        case 19:
                                        case 20:
                                        case 21:
                                        case 22:
                                        case 23:
                                        case 24:
                                        case 25:
                                        case 26:
                                        case 27:
                                        case 28:
                                        case 29:
                                        case 30:
                                        case 31:
                                        case 32:
                                        case 33:
                                        case 34:
                                        case 35:
                                        case 36:
                                        case 37:
                                        case 38:
                                        case 39:
                                        case 40:
                                        case 41:
                                        case 42:
                                        case 43:
                                        case 44:
                                        case 45:
                                        case 46:
                                        case 47:
                                        case 48:
                                        case 49:
                                        case 50:
                                        case 51:
                                        case 52:
                                        case 53:
                                        case 54:
                                        case 55:
                                        case 56:
                                        case 57:
                                        case 58:
                                        case PlaylistDecorationPolicy.TAG_MANIFEST_FIELD_NUMBER /* 59 */:
                                        case 60:
                                        case 61:
                                        case 62:
                                        case 63:
                                        case 64:
                                        case 65:
                                        case 66:
                                        case 67:
                                        case 68:
                                        case 69:
                                        case 70:
                                        case 71:
                                        case 72:
                                        case 73:
                                        case 74:
                                        case 75:
                                        case 76:
                                        case 77:
                                        case 78:
                                        case 79:
                                        case 80:
                                        case 81:
                                        case 82:
                                        case 83:
                                        case 84:
                                        case 85:
                                        case Metadata$Episode.RSS_GUID_FIELD_NUMBER /* 86 */:
                                        case 87:
                                        case Metadata$Episode.SEASON_NUMBER_FIELD_NUMBER /* 88 */:
                                        case 89:
                                        case 90:
                                        case 91:
                                        case 92:
                                        case 93:
                                        case 94:
                                        case 95:
                                        case 96:
                                        case com.spotify.metadata.proto.Metadata$Episode.IS_PODCAST_SHORT_FIELD_NUMBER /* 97 */:
                                        case 98:
                                        case 99:
                                        case 100:
                                        case 101:
                                        case 102:
                                        case 103:
                                        case 104:
                                        case 105:
                                        case Error.INVALID_COUNTRY_FIELD_NUMBER /* 106 */:
                                        case Error.TOO_YOUNG_FIELD_NUMBER /* 107 */:
                                        case 108:
                                        case 109:
                                        case 110:
                                        case ContentType.SHORT_FORM_ON_DEMAND /* 111 */:
                                        case ContentType.LONG_FORM_ON_DEMAND /* 112 */:
                                        case ContentType.LIVE /* 113 */:
                                        case 114:
                                        case 115:
                                        case 116:
                                        case 117:
                                        case 118:
                                        case 119:
                                        case 120:
                                        case ContentType.USER_GENERATED_SHORT_FORM_ON_DEMAND /* 121 */:
                                        case ContentType.USER_GENERATED_LONG_FORM_ON_DEMAND /* 122 */:
                                        case ContentType.USER_GENERATED_LIVE /* 123 */:
                                        case 124:
                                        case 125:
                                        case 126:
                                        case 127:
                                        case 128:
                                        case 129:
                                        case 130:
                                        case 131:
                                        case 132:
                                        case 133:
                                        case 134:
                                        case 135:
                                        case 136:
                                        case 137:
                                        case 138:
                                        case 139:
                                            z = true;
                                            break;
                                    }
                                }
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                                z = true;
                                break;
                        }
                    } else {
                        str2 = Build.MODEL;
                        str2.getClass();
                        switch (str2.hashCode()) {
                            case -349662828:
                                if (!str2.equals("AFTJMST12")) {
                                    b = -1;
                                } else {
                                    b = 0;
                                }
                                break;
                            case -321033677:
                                if (!str2.equals("AFTKMST12")) {
                                    b = -1;
                                } else {
                                    b = 1;
                                }
                                break;
                            case 2006354:
                                if (!str2.equals("AFTA")) {
                                    b = -1;
                                } else {
                                    b = 2;
                                }
                                break;
                            case 2006367:
                                if (!str2.equals("AFTN")) {
                                    b = -1;
                                } else {
                                    b = 3;
                                }
                                break;
                            case 2006371:
                                if (!str2.equals("AFTR")) {
                                    b = -1;
                                } else {
                                    b = 4;
                                }
                                break;
                            case 1785421873:
                                if (!str2.equals("AFTEU011")) {
                                    b = -1;
                                } else {
                                    b = 5;
                                }
                                break;
                            case 1785421876:
                                if (!str2.equals("AFTEU014")) {
                                    b = -1;
                                } else {
                                    b = 6;
                                }
                                break;
                            case 1798172390:
                                if (!str2.equals("AFTSO001")) {
                                    b = -1;
                                } else {
                                    b = 7;
                                }
                                break;
                            case 2119412532:
                                if (!str2.equals("AFTEUFF014")) {
                                    b = -1;
                                } else {
                                    b = 8;
                                }
                                break;
                            default:
                                b = -1;
                                break;
                        }
                        switch (b) {
                            default:
                                if (i <= 26) {
                                    str3 = Build.DEVICE;
                                    str3.getClass();
                                    switch (str3.hashCode()) {
                                        case -2144781245:
                                            if (!str3.equals("GIONEE_SWW1609")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 0;
                                            }
                                            break;
                                        case -2144781185:
                                            if (!str3.equals("GIONEE_SWW1627")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 1;
                                            }
                                            break;
                                        case -2144781160:
                                            if (!str3.equals("GIONEE_SWW1631")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 2;
                                            }
                                            break;
                                        case -2097309513:
                                            if (!str3.equals("K50a40")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 3;
                                            }
                                            break;
                                        case -2022874474:
                                            if (!str3.equals("CP8676_I02")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 4;
                                            }
                                            break;
                                        case -1978993182:
                                            if (!str3.equals("NX541J")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 5;
                                            }
                                            break;
                                        case -1978990237:
                                            if (!str3.equals("NX573J")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 6;
                                            }
                                            break;
                                        case -1936688988:
                                            if (!str3.equals("PGN528")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 7;
                                            }
                                            break;
                                        case -1936688066:
                                            if (!str3.equals("PGN610")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 8;
                                            }
                                            break;
                                        case -1936688065:
                                            if (!str3.equals("PGN611")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 9;
                                            }
                                            break;
                                        case -1931988508:
                                            if (!str3.equals("AquaPowerM")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 10;
                                            }
                                            break;
                                        case -1885099851:
                                            if (!str3.equals("RAIJIN")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 11;
                                            }
                                            break;
                                        case -1696512866:
                                            if (!str3.equals("XT1663")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 12;
                                            }
                                            break;
                                        case -1680025915:
                                            if (!str3.equals("ComioS1")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 13;
                                            }
                                            break;
                                        case -1615810839:
                                            if (!str3.equals("Phantom6")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 14;
                                            }
                                            break;
                                        case -1600724499:
                                            if (!str3.equals("pacificrim")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 15;
                                            }
                                            break;
                                        case -1554255044:
                                            if (!str3.equals("vernee_M5")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 16;
                                            }
                                            break;
                                        case -1481772737:
                                            if (!str3.equals("panell_dl")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 17;
                                            }
                                            break;
                                        case -1481772730:
                                            if (!str3.equals("panell_ds")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 18;
                                            }
                                            break;
                                        case -1481772729:
                                            if (!str3.equals("panell_dt")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 19;
                                            }
                                            break;
                                        case -1320080169:
                                            if (!str3.equals("GiONEE_GBL7319")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 20;
                                            }
                                            break;
                                        case -1217592143:
                                            if (!str3.equals("BRAVIA_ATV2")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 21;
                                            }
                                            break;
                                        case -1180384755:
                                            if (!str3.equals("iris60")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 22;
                                            }
                                            break;
                                        case -1139198265:
                                            if (!str3.equals("Slate_Pro")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 23;
                                            }
                                            break;
                                        case -1052835013:
                                            if (!str3.equals("namath")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 24;
                                            }
                                            break;
                                        case -993250464:
                                            if (!str3.equals("A10-70F")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 25;
                                            }
                                            break;
                                        case -993250458:
                                            if (!str3.equals("A10-70L")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 26;
                                            }
                                            break;
                                        case -965403638:
                                            if (!str3.equals("s905x018")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 27;
                                            }
                                            break;
                                        case -958336948:
                                            if (!str3.equals("ELUGA_Ray_X")) {
                                                b3 = -1;
                                            }
                                            break;
                                        case -879245230:
                                            if (!str3.equals("tcl_eu")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 29;
                                            }
                                            break;
                                        case -842500323:
                                            if (!str3.equals("nicklaus_f")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 30;
                                            }
                                            break;
                                        case -821392978:
                                            if (!str3.equals("A7000-a")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 31;
                                            }
                                            break;
                                        case -797483286:
                                            if (!str3.equals("SVP-DTV15")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 32;
                                            }
                                            break;
                                        case -794946968:
                                            if (!str3.equals("watson")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 33;
                                            }
                                            break;
                                        case -788334647:
                                            if (!str3.equals("whyred")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 34;
                                            }
                                            break;
                                        case -782144577:
                                            if (!str3.equals("OnePlus5T")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 35;
                                            }
                                            break;
                                        case -575125681:
                                            if (!str3.equals("GiONEE_CBL7513")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 36;
                                            }
                                            break;
                                        case -521118391:
                                            if (!str3.equals("GIONEE_GBL7360")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 37;
                                            }
                                            break;
                                        case -430914369:
                                            if (!str3.equals("Pixi4-7_3G")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 38;
                                            }
                                            break;
                                        case -290434366:
                                            if (!str3.equals("taido_row")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 39;
                                            }
                                            break;
                                        case -282781963:
                                            if (!str3.equals("BLACK-1X")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 40;
                                            }
                                            break;
                                        case -277133239:
                                            if (!str3.equals("Z12_PRO")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 41;
                                            }
                                            break;
                                        case -173639913:
                                            if (!str3.equals("ELUGA_A3_Pro")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 42;
                                            }
                                            break;
                                        case -56598463:
                                            if (!str3.equals("woods_fn")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 43;
                                            }
                                            break;
                                        case 2126:
                                            if (!str3.equals("C1")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 44;
                                            }
                                            break;
                                        case 2564:
                                            if (!str3.equals("Q5")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 45;
                                            }
                                            break;
                                        case 2715:
                                            if (!str3.equals("V1")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 46;
                                            }
                                            break;
                                        case 2719:
                                            if (!str3.equals("V5")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 47;
                                            }
                                            break;
                                        case 3091:
                                            if (!str3.equals("b5")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 48;
                                            }
                                            break;
                                        case 3483:
                                            if (!str3.equals("mh")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 49;
                                            }
                                            break;
                                        case 73405:
                                            if (!str3.equals("JGZ")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 50;
                                            }
                                            break;
                                        case 75537:
                                            if (!str3.equals("M04")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 51;
                                            }
                                            break;
                                        case 75739:
                                            if (!str3.equals("M5c")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 52;
                                            }
                                            break;
                                        case 76779:
                                            if (!str3.equals("MX6")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 53;
                                            }
                                            break;
                                        case 78669:
                                            if (!str3.equals("P85")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 54;
                                            }
                                            break;
                                        case 79305:
                                            if (!str3.equals("PLE")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 55;
                                            }
                                            break;
                                        case 80618:
                                            if (!str3.equals("QX1")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 56;
                                            }
                                            break;
                                        case 88274:
                                            if (!str3.equals("Z80")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 57;
                                            }
                                            break;
                                        case 98846:
                                            if (!str3.equals("cv1")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 58;
                                            }
                                            break;
                                        case 98848:
                                            if (!str3.equals("cv3")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 59;
                                            }
                                            break;
                                        case 99329:
                                            if (!str3.equals("deb")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 60;
                                            }
                                            break;
                                        case 101481:
                                            if (!str3.equals("flo")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 61;
                                            }
                                            break;
                                        case 1513190:
                                            if (!str3.equals("1601")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 62;
                                            }
                                            break;
                                        case 1514184:
                                            if (!str3.equals("1713")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 63;
                                            }
                                            break;
                                        case 1514185:
                                            if (!str3.equals("1714")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 64;
                                            }
                                            break;
                                        case 2133089:
                                            if (!str3.equals("F01H")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 65;
                                            }
                                            break;
                                        case 2133091:
                                            if (!str3.equals("F01J")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 66;
                                            }
                                            break;
                                        case 2133120:
                                            if (!str3.equals("F02H")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 67;
                                            }
                                            break;
                                        case 2133151:
                                            if (!str3.equals("F03H")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 68;
                                            }
                                            break;
                                        case 2133182:
                                            if (!str3.equals("F04H")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 69;
                                            }
                                            break;
                                        case 2133184:
                                            if (!str3.equals("F04J")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 70;
                                            }
                                            break;
                                        case 2436959:
                                            if (!str3.equals("P681")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 71;
                                            }
                                            break;
                                        case 2463773:
                                            if (!str3.equals("Q350")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 72;
                                            }
                                            break;
                                        case 2464648:
                                            if (!str3.equals("Q427")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 73;
                                            }
                                            break;
                                        case 2689555:
                                            if (!str3.equals("XE2X")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 74;
                                            }
                                            break;
                                        case 3154429:
                                            if (!str3.equals("fugu")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 75;
                                            }
                                            break;
                                        case 3284551:
                                            if (!str3.equals("kate")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 76;
                                            }
                                            break;
                                        case 3351335:
                                            if (!str3.equals("mido")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 77;
                                            }
                                            break;
                                        case 3386211:
                                            if (!str3.equals("p212")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 78;
                                            }
                                            break;
                                        case 41325051:
                                            if (!str3.equals("MEIZU_M5")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 79;
                                            }
                                            break;
                                        case 51349633:
                                            if (!str3.equals("601LV")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 80;
                                            }
                                            break;
                                        case 51350594:
                                            if (!str3.equals("602LV")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 81;
                                            }
                                            break;
                                        case 55178625:
                                            if (!str3.equals("Aura_Note_2")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 82;
                                            }
                                            break;
                                        case 61542055:
                                            if (!str3.equals("A1601")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 83;
                                            }
                                            break;
                                        case 65355429:
                                            if (!str3.equals("E5643")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 84;
                                            }
                                            break;
                                        case 66214468:
                                            if (!str3.equals("F3111")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 85;
                                            }
                                            break;
                                        case 66214470:
                                            if (!str3.equals("F3113")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 86;
                                            }
                                            break;
                                        case 66214473:
                                            if (!str3.equals("F3116")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 87;
                                            }
                                            break;
                                        case 66215429:
                                            if (!str3.equals("F3211")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 88;
                                            }
                                            break;
                                        case 66215431:
                                            if (!str3.equals("F3213")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 89;
                                            }
                                            break;
                                        case 66215433:
                                            if (!str3.equals("F3215")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 90;
                                            }
                                            break;
                                        case 66216390:
                                            if (!str3.equals("F3311")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 91;
                                            }
                                            break;
                                        case 76402249:
                                            if (!str3.equals("PRO7S")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 92;
                                            }
                                            break;
                                        case 76404105:
                                            if (!str3.equals("Q4260")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 93;
                                            }
                                            break;
                                        case 76404911:
                                            if (!str3.equals("Q4310")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 94;
                                            }
                                            break;
                                        case 80963634:
                                            if (!str3.equals("V23GB")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 95;
                                            }
                                            break;
                                        case 82882791:
                                            if (!str3.equals("X3_HK")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 96;
                                            }
                                            break;
                                        case 98715550:
                                            if (!str3.equals("i9031")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 97;
                                            }
                                            break;
                                        case 101370885:
                                            if (!str3.equals("l5460")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 98;
                                            }
                                            break;
                                        case 102844228:
                                            if (!str3.equals("le_x6")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 99;
                                            }
                                            break;
                                        case 165221241:
                                            if (!str3.equals("A2016a40")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 100;
                                            }
                                            break;
                                        case 182191441:
                                            if (!str3.equals("CPY83_I00")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 101;
                                            }
                                            break;
                                        case 245388979:
                                            if (!str3.equals("marino_f")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 102;
                                            }
                                            break;
                                        case 287431619:
                                            if (!str3.equals("griffin")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 103;
                                            }
                                            break;
                                        case 307593612:
                                            if (!str3.equals("A7010a48")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 104;
                                            }
                                            break;
                                        case 308517133:
                                            if (!str3.equals("A7020a48")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 105;
                                            }
                                            break;
                                        case 316215098:
                                            if (!str3.equals("TB3-730F")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 106;
                                            }
                                            break;
                                        case 316215116:
                                            if (!str3.equals("TB3-730X")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 107;
                                            }
                                            break;
                                        case 316246811:
                                            if (!str3.equals("TB3-850F")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 108;
                                            }
                                            break;
                                        case 316246818:
                                            if (!str3.equals("TB3-850M")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 109;
                                            }
                                            break;
                                        case 407160593:
                                            if (!str3.equals("Pixi5-10_4G")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 110;
                                            }
                                            break;
                                        case 507412548:
                                            if (!str3.equals("QM16XE_U")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 111;
                                            }
                                            break;
                                        case 793982701:
                                            if (!str3.equals("GIONEE_WBL5708")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 112;
                                            }
                                            break;
                                        case 794038622:
                                            if (!str3.equals("GIONEE_WBL7365")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 113;
                                            }
                                            break;
                                        case 794040393:
                                            if (!str3.equals("GIONEE_WBL7519")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 114;
                                            }
                                            break;
                                        case 835649806:
                                            if (!str3.equals("manning")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 115;
                                            }
                                            break;
                                        case 917340916:
                                            if (!str3.equals("A7000plus")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 116;
                                            }
                                            break;
                                        case 958008161:
                                            if (!str3.equals("j2xlteins")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 117;
                                            }
                                            break;
                                        case 1060579533:
                                            if (!str3.equals("panell_d")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 118;
                                            }
                                            break;
                                        case 1150207623:
                                            if (!str3.equals("LS-5017")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 119;
                                            }
                                            break;
                                        case 1176899427:
                                            if (!str3.equals("itel_S41")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 120;
                                            }
                                            break;
                                        case 1280332038:
                                            if (!str3.equals("hwALE-H")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 121;
                                            }
                                            break;
                                        case 1306947716:
                                            if (!str3.equals("EverStar_S")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 122;
                                            }
                                            break;
                                        case 1349174697:
                                            if (!str3.equals("htc_e56ml_dtul")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 123;
                                            }
                                            break;
                                        case 1522194893:
                                            if (!str3.equals("woods_f")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 124;
                                            }
                                            break;
                                        case 1691543273:
                                            if (!str3.equals("CPH1609")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 125;
                                            }
                                            break;
                                        case 1691544261:
                                            if (!str3.equals("CPH1715")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 126;
                                            }
                                            break;
                                        case 1709443163:
                                            if (!str3.equals("iball8735_9806")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 127;
                                            }
                                            break;
                                        case 1865889110:
                                            if (!str3.equals("santoni")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 128;
                                            }
                                            break;
                                        case 1906253259:
                                            if (!str3.equals("PB2-670M")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 129;
                                            }
                                            break;
                                        case 1977196784:
                                            if (!str3.equals("Infinix-X572")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 130;
                                            }
                                            break;
                                        case 2006372676:
                                            if (!str3.equals("BRAVIA_ATV3_4K")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 131;
                                            }
                                            break;
                                        case 2019281702:
                                            if (!str3.equals("DM-01K")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 132;
                                            }
                                            break;
                                        case 2029784656:
                                            if (!str3.equals("HWBLN-H")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 133;
                                            }
                                            break;
                                        case 2030379515:
                                            if (!str3.equals("HWCAM-H")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 134;
                                            }
                                            break;
                                        case 2033393791:
                                            if (!str3.equals("ASUS_X00AD_2")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 135;
                                            }
                                            break;
                                        case 2047190025:
                                            if (!str3.equals("ELUGA_Note")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 136;
                                            }
                                            break;
                                        case 2047252157:
                                            if (!str3.equals("ELUGA_Prim")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 137;
                                            }
                                            break;
                                        case 2048319463:
                                            if (!str3.equals("HWVNS-H")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 138;
                                            }
                                            break;
                                        case 2048855701:
                                            if (!str3.equals("HWWAS-H")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 139;
                                            }
                                            break;
                                        default:
                                            b3 = -1;
                                            break;
                                    }
                                    switch (b3) {
                                        default:
                                            if (str2.equals("JSN-L21")) {
                                            }
                                        case 0:
                                        case 1:
                                        case 2:
                                        case 3:
                                        case 4:
                                        case 5:
                                        case 6:
                                        case 7:
                                        case 8:
                                        case 9:
                                        case 10:
                                        case 11:
                                        case 12:
                                        case 13:
                                        case 14:
                                        case 15:
                                        case 16:
                                        case 17:
                                        case 18:
                                        case 19:
                                        case 20:
                                        case 21:
                                        case 22:
                                        case 23:
                                        case 24:
                                        case 25:
                                        case 26:
                                        case 27:
                                        case 28:
                                        case 29:
                                        case 30:
                                        case 31:
                                        case 32:
                                        case 33:
                                        case 34:
                                        case 35:
                                        case 36:
                                        case 37:
                                        case 38:
                                        case 39:
                                        case 40:
                                        case 41:
                                        case 42:
                                        case 43:
                                        case 44:
                                        case 45:
                                        case 46:
                                        case 47:
                                        case 48:
                                        case 49:
                                        case 50:
                                        case 51:
                                        case 52:
                                        case 53:
                                        case 54:
                                        case 55:
                                        case 56:
                                        case 57:
                                        case 58:
                                        case PlaylistDecorationPolicy.TAG_MANIFEST_FIELD_NUMBER /* 59 */:
                                        case 60:
                                        case 61:
                                        case 62:
                                        case 63:
                                        case 64:
                                        case 65:
                                        case 66:
                                        case 67:
                                        case 68:
                                        case 69:
                                        case 70:
                                        case 71:
                                        case 72:
                                        case 73:
                                        case 74:
                                        case 75:
                                        case 76:
                                        case 77:
                                        case 78:
                                        case 79:
                                        case 80:
                                        case 81:
                                        case 82:
                                        case 83:
                                        case 84:
                                        case 85:
                                        case Metadata$Episode.RSS_GUID_FIELD_NUMBER /* 86 */:
                                        case 87:
                                        case Metadata$Episode.SEASON_NUMBER_FIELD_NUMBER /* 88 */:
                                        case 89:
                                        case 90:
                                        case 91:
                                        case 92:
                                        case 93:
                                        case 94:
                                        case 95:
                                        case 96:
                                        case com.spotify.metadata.proto.Metadata$Episode.IS_PODCAST_SHORT_FIELD_NUMBER /* 97 */:
                                        case 98:
                                        case 99:
                                        case 100:
                                        case 101:
                                        case 102:
                                        case 103:
                                        case 104:
                                        case 105:
                                        case Error.INVALID_COUNTRY_FIELD_NUMBER /* 106 */:
                                        case Error.TOO_YOUNG_FIELD_NUMBER /* 107 */:
                                        case 108:
                                        case 109:
                                        case 110:
                                        case ContentType.SHORT_FORM_ON_DEMAND /* 111 */:
                                        case ContentType.LONG_FORM_ON_DEMAND /* 112 */:
                                        case ContentType.LIVE /* 113 */:
                                        case 114:
                                        case 115:
                                        case 116:
                                        case 117:
                                        case 118:
                                        case 119:
                                        case 120:
                                        case ContentType.USER_GENERATED_SHORT_FORM_ON_DEMAND /* 121 */:
                                        case ContentType.USER_GENERATED_LONG_FORM_ON_DEMAND /* 122 */:
                                        case ContentType.USER_GENERATED_LIVE /* 123 */:
                                        case 124:
                                        case 125:
                                        case 126:
                                        case 127:
                                        case 128:
                                        case 129:
                                        case 130:
                                        case 131:
                                        case 132:
                                        case 133:
                                        case 134:
                                        case 135:
                                        case 136:
                                        case 137:
                                        case 138:
                                        case 139:
                                            z = true;
                                            break;
                                    }
                                }
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                                z = true;
                                break;
                        }
                    }
                    f1031e3 = z;
                    f1030d3 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f1031e3;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:19:0x003f  */
    /* JADX INFO: renamed from: V0 */
    public static int m801V0(tad0 tad0Var, r300 r300Var) {
        int i = r300Var.f195394w;
        int i2 = r300Var.f195395x;
        if (i != -1 && i2 != -1) {
            String str = r300Var.f195387p;
            str.getClass();
            if ("video/dolby-vision".equals(str)) {
                Pair pairM63005c = mwe.m63005c(r300Var);
                if (pairM63005c == null) {
                    str = "video/hevc";
                } else {
                    int iIntValue = ((Integer) pairM63005c.first).intValue();
                    if (iIntValue == 512 || iIntValue == 1 || iIntValue == 2) {
                        str = "video/avc";
                    } else if (iIntValue == 1024) {
                        str = "video/av01";
                    } else {
                        str = "video/hevc";
                    }
                }
            }
            switch (str) {
                case "video/3gpp":
                case "video/av01":
                case "video/mp4v-es":
                case "video/x-vnd.on2.vp8":
                    return ((i * i2) * 3) / 4;
                case "video/hevc":
                    return Math.max(2097152, ((i * i2) * 3) / 4);
                case "video/avc":
                    HashSet hashSet = dgd0.f48781a;
                    String str2 = Build.MODEL;
                    if (!"BRAVIA 4K 2015".equals(str2) && (!"Amazon".equals(Build.MANUFACTURER) || (!"KFSOWI".equals(str2) && (!"AFTS".equals(str2) || !tad0Var.f218549f)))) {
                        return ((h0b1.m46311g(i2, 16) * h0b1.m46311g(i, 16)) * 768) / 4;
                    }
                    break;
                case "video/x-vnd.on2.vp9":
                    return ((i * i2) * 3) / 8;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: W0 */
    public static List m802W0(Context context, wra wraVar, r300 r300Var, boolean z, boolean z2) {
        String str = r300Var.f195387p;
        if (str == null) {
            return wsv0.f254763e;
        }
        if (Build.VERSION.SDK_INT >= 26 && "video/dolby-vision".equals(str) && !fz6.m43164t(context)) {
            String strM95773c = zad0.m95773c(r300Var);
            List listM88828c = strM95773c == null ? wsv0.f254763e : wraVar.m88828c(strM95773c, z, z2);
            if (!listM88828c.isEmpty()) {
                return listM88828c;
            }
        }
        return zad0.m95778h(wraVar, r300Var, z, z2);
    }

    /* JADX INFO: renamed from: X0 */
    public static int m803X0(tad0 tad0Var, r300 r300Var) {
        int i = r300Var.f195388q;
        List list = r300Var.f195390s;
        if (i == -1) {
            return m801V0(tad0Var, r300Var);
        }
        int size = list.size();
        int length = 0;
        for (int i2 = 0; i2 < size; i2++) {
            length += ((byte[]) list.get(i2)).length;
        }
        return r300Var.f195388q + length;
    }

    @Override // p204p.o09
    /* JADX INFO: renamed from: A */
    public final void mo804A() {
        i9c1 i9c1Var = this.f1077y2;
        if (i9c1Var == null || !this.f1061i2) {
            return;
        }
        i9c1Var.release();
    }

    @Override // p204p.vad0
    /* JADX INFO: renamed from: A0 */
    public final void mo805A0(iro iroVar) {
        ByteBuffer byteBuffer;
        int iM87002g;
        int i;
        ByteBuffer byteBuffer2;
        p7f p7fVar;
        tad0 tad0Var = this.f239248t1;
        tad0Var.getClass();
        String str = tad0Var.f218545b;
        if (str.equals("video/av01") && (byteBuffer2 = iroVar.f105018d) != null) {
            r300 r300Var = this.f239242n1;
            boolean z = (r300Var == null || (p7fVar = r300Var.f195358H) == null || p7fVar.f174679e <= 8) ? false : true;
            if (this.f1076x2 && !byteBuffer2.isReadOnly()) {
                hra.m48350C(byteBuffer2, false);
            } else if (z && this.f1074v2 && !byteBuffer2.isReadOnly()) {
                hra.m48350C(byteBuffer2, true);
            }
            fw7 fw7Var = this.f1068p2;
            if (fw7Var != null && iroVar.m67519d(1)) {
                int iPosition = byteBuffer2.position();
                int iLimit = byteBuffer2.limit();
                byteBuffer2.limit(Math.min(iLimit, iPosition + CtaType.CTA_NOT_INTERESTED_FIELD_NUMBER));
                ByteBuffer byteBuffer3 = (ByteBuffer) fw7Var.f74006b;
                byteBuffer3.clear();
                byteBuffer3.put(byteBuffer2);
                byteBuffer3.flip();
                byteBuffer2.position(iPosition);
                byteBuffer2.limit(iLimit);
            }
        } else if (str.equals("video/hevc") && (byteBuffer = iroVar.f105018d) != null && this.f1076x2 && !byteBuffer.isReadOnly()) {
            ByteBuffer byteBuffer4 = iroVar.f105018d;
            int iPosition2 = byteBuffer4.position();
            int iLimit2 = byteBuffer4.limit();
            if (iLimit2 - iPosition2 >= 4) {
                while (iPosition2 < iLimit2) {
                    int iM87002g2 = w1h1.m87002g(byteBuffer4, iPosition2, iLimit2);
                    if (iM87002g2 == iLimit2 || (iM87002g = iM87002g2 + 3) >= iLimit2 || ((i = (byteBuffer4.get(iM87002g) & 126) >> 1) >= 0 && i <= 31)) {
                        break;
                    }
                    if (i == 39) {
                        int i2 = iM87002g2 + 5;
                        iM87002g = w1h1.m87002g(byteBuffer4, i2, iLimit2);
                        int i3 = 0;
                        while (i2 < iM87002g) {
                            int i4 = 0;
                            while (i2 < iM87002g) {
                                int i5 = byteBuffer4.get(i2) & 255;
                                if (i5 != 3 || i3 < 2) {
                                    i3 = i5 == 0 ? i3 + 1 : 0;
                                    int i6 = i2 + 1;
                                    i4 += i5;
                                    if (i5 != 255) {
                                        if (i4 == 4) {
                                            byteBuffer4.put(i2, (byte) -2);
                                        }
                                        i2 = i6;
                                        break;
                                    }
                                    i2 = i6;
                                } else {
                                    i2++;
                                    i3 = 0;
                                }
                            }
                            if (i2 >= iM87002g) {
                                break;
                            }
                            int i7 = 0;
                            while (i2 < iM87002g) {
                                int i8 = byteBuffer4.get(i2) & 255;
                                if (i8 != 3 || i3 < 2) {
                                    i3 = i8 == 0 ? i3 + 1 : 0;
                                    i2++;
                                    i7 += i8;
                                    if (i8 != 255) {
                                        break;
                                    }
                                } else {
                                    i2++;
                                    i3 = 0;
                                }
                            }
                            int i9 = 0;
                            while (i9 < i7 && i2 < iM87002g) {
                                int i10 = i2 + 1;
                                int i11 = byteBuffer4.get(i2) & 255;
                                if (i11 != 3 || i3 < 2) {
                                    if (i11 == 0) {
                                        i3++;
                                    }
                                    i9++;
                                    i2 = i10;
                                } else {
                                    i9--;
                                }
                                i3 = 0;
                                i9++;
                                i2 = i10;
                            }
                        }
                    }
                    iPosition2 = iM87002g;
                }
            }
        }
        this.f1059b3 = 0;
        int iMo832f0 = mo832f0(iroVar);
        if ((Build.VERSION.SDK_INT < 34 || (iMo832f0 & 32) == 0) && !this.f1053V2) {
            this.f1043L2++;
        }
    }

    @Override // p204p.o09
    /* JADX INFO: renamed from: B */
    public final void mo806B() {
        try {
            try {
                this.f239193F1 = false;
                m85059G0();
                m85058E0();
                bhs bhsVar = this.f239235g1;
                if (bhsVar != null) {
                    bhsVar.mo29258b(null);
                }
                this.f239235g1 = null;
                this.f1078z2 = false;
                this.f1057Z2 = -9223372036854775807L;
                this.f1076x2 = false;
                e7o0 e7o0Var = this.f1035D2;
                if (e7o0Var != null) {
                    e7o0Var.release();
                    this.f1035D2 = null;
                }
            } catch (Throwable th) {
                bhs bhsVar2 = this.f239235g1;
                if (bhsVar2 != null) {
                    bhsVar2.mo29258b(null);
                }
                this.f239235g1 = null;
                throw th;
            }
        } catch (Throwable th2) {
            this.f1078z2 = false;
            this.f1057Z2 = -9223372036854775807L;
            this.f1076x2 = false;
            e7o0 e7o0Var2 = this.f1035D2;
            if (e7o0Var2 != null) {
                e7o0Var2.release();
                this.f1035D2 = null;
            }
            throw th2;
        }
    }

    @Override // p204p.o09
    /* JADX INFO: renamed from: C */
    public final void mo807C() {
        this.f1041J2 = 0;
        this.f160293g.getClass();
        this.f1040I2 = SystemClock.elapsedRealtime();
        this.f1047P2 = 0L;
        this.f1048Q2 = 0;
        i9c1 i9c1Var = this.f1077y2;
        if (i9c1Var != null) {
            i9c1Var.mo793p();
        } else {
            this.f1065m2.m861d();
        }
    }

    @Override // p204p.vad0
    /* JADX INFO: renamed from: C0 */
    public final boolean mo808C0(long j, long j2, qad0 qad0Var, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, r300 r300Var) {
        iez iezVar;
        qad0Var.getClass();
        long j4 = j3 - this.f239218X1.f228458c;
        boolean z3 = this.f1065m2.f1086h != -9223372036854775807L;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            PriorityQueue priorityQueue = this.f1071s2;
            Long l = (Long) priorityQueue.peek();
            iezVar = this.f1067o2;
            if (l == null || l.longValue() >= j3) {
                break;
            }
            priorityQueue.poll();
            iezVar.m50406b(1000 * l.longValue());
            if (l.longValue() < this.f160285Y || z3) {
                i5++;
            } else {
                i4++;
            }
        }
        m840j1(i4, 0);
        this.f239216W1.f94496d += i5;
        iezVar.m50406b(j3 * 1000);
        i9c1 i9c1Var = this.f1077y2;
        if (i9c1Var != null) {
            if (!z || z2) {
                return i9c1Var.mo785h(j3, new bbd0(this, qad0Var, i, j4));
            }
            m839i1(qad0Var, i);
            return true;
        }
        int iM858a = this.f1065m2.m858a(j3, j, j2, this.f239218X1.f228457b, z, z2, iezVar.m50405a(), iezVar.f101592h, this.f1066n2);
        gha ghaVar = this.f1066n2;
        zxb1 zxb1Var = this.f1070r2;
        if (zxb1Var != null && iM858a != 5 && iM858a != 4) {
            zxb1Var.m97178a(j3, ghaVar.f79860a);
        }
        if (iM858a == 0) {
            this.f160293g.getClass();
            long jNanoTime = System.nanoTime();
            oxb1 oxb1Var = this.f1056Y2;
            if (oxb1Var != null) {
                oxb1Var.mo33002a(j4, jNanoTime, r300Var, this.f239243o1);
            }
            m829d1(qad0Var, i, jNanoTime);
            m842k1(ghaVar.f79860a);
            return true;
        }
        if (iM858a == 1) {
            long j5 = ghaVar.f79861b;
            long j6 = ghaVar.f79860a;
            if (j5 == this.f1049R2) {
                m839i1(qad0Var, i);
            } else {
                oxb1 oxb1Var2 = this.f1056Y2;
                if (oxb1Var2 != null) {
                    oxb1Var2.mo33002a(j4, j5, r300Var, this.f239243o1);
                }
                m829d1(qad0Var, i, j5);
            }
            m842k1(j6);
            this.f1049R2 = j5;
            return true;
        }
        if (iM858a == 2) {
            Trace.beginSection("dropVideoBuffer");
            qad0Var.mo28890k(i);
            Trace.endSection();
            m840j1(0, 1);
            m842k1(ghaVar.f79860a);
            return true;
        }
        if (iM858a == 3) {
            m839i1(qad0Var, i);
            m842k1(ghaVar.f79860a);
            return true;
        }
        if (iM858a == 4 || iM858a == 5) {
            return false;
        }
        throw new IllegalStateException(String.valueOf(iM858a));
    }

    @Override // p204p.o09
    /* JADX INFO: renamed from: D */
    public final void mo809D() {
        m826b1();
        int i = this.f1048Q2;
        if (i != 0) {
            long j = this.f1047P2;
            bka1 bka1Var = this.f1062j2;
            Handler handler = (Handler) bka1Var.f27887b;
            if (handler != null) {
                handler.post(new l5c1(bka1Var, j, i));
            }
            this.f1047P2 = 0L;
            this.f1048Q2 = 0;
        }
        i9c1 i9c1Var = this.f1077y2;
        if (i9c1Var != null) {
            i9c1Var.mo791n();
        } else {
            C0069c c0069c = this.f1065m2;
            c0069c.f1082d = false;
            c0069c.f1086h = -9223372036854775807L;
            C0071e c0071e = c0069c.f1080b;
            c0071e.f1096d = false;
            VideoFrameReleaseHelper$VSyncSampler videoFrameReleaseHelper$VSyncSampler = c0071e.f1095c;
            if (videoFrameReleaseHelper$VSyncSampler != null) {
                videoFrameReleaseHelper$VSyncSampler.unregister();
            }
            c0071e.m865a();
        }
        zxb1 zxb1Var = this.f1070r2;
        if (zxb1Var != null) {
            zxb1Var.m97179b();
        }
    }

    @Override // p204p.vad0, p204p.o09
    /* JADX INFO: renamed from: E */
    public final void mo810E(r300[] r300VarArr, long j, long j2, vsd0 vsd0Var) {
        super.mo810E(r300VarArr, j, j2, vsd0Var);
        zxb1 zxb1Var = this.f1070r2;
        if (zxb1Var != null) {
            zxb1Var.m97179b();
        }
    }

    @Override // p204p.vad0
    /* JADX INFO: renamed from: F0 */
    public final void mo811F0() {
        i9c1 i9c1Var = this.f1077y2;
        if (i9c1Var != null) {
            i9c1Var.mo778a();
        } else {
            long j = this.f239218X1.f228463h;
        }
    }

    @Override // p204p.vad0
    /* JADX INFO: renamed from: H0 */
    public final void mo812H0() {
        super.mo812H0();
        this.f1071s2.clear();
        this.f1043L2 = 0;
        this.f1059b3 = 0;
        this.f1046O2 = false;
        fw7 fw7Var = this.f1068p2;
        if (fw7Var != null) {
            fw7Var.f74007c = null;
            ByteBuffer byteBuffer = (ByteBuffer) fw7Var.f74006b;
            byteBuffer.position(byteBuffer.limit());
        }
    }

    @Override // p204p.vad0, p204p.o09
    /* JADX INFO: renamed from: I */
    public final void mo813I(long j, long j2) throws ExoPlaybackException {
        i9c1 i9c1Var = this.f1077y2;
        if (i9c1Var != null) {
            try {
                i9c1Var.mo798u(j, j2);
            } catch (VideoSink$VideoSinkException e) {
                throw m65998b(e, e.f1017a, false, 7001);
            }
        }
        super.mo813I(j, j2);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003b  */
    /* JADX WARN: Code duplicated, block: B:90:0x013e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:91:0x0140  */
    @Override // p204p.vad0
    /* JADX INFO: renamed from: L0 */
    public final boolean mo814L0(iro iroVar) {
        boolean z;
        ByteBuffer byteBuffer;
        int iLimit;
        kqk0 kqk0Var;
        nn40 nn40Var;
        boolean z2 = false;
        if (!m825a1(iroVar)) {
            long j = iroVar.f105020f;
            boolean z3 = j < this.f160285Y;
            zxb1 zxb1Var = this.f1070r2;
            if (zxb1Var != null) {
                long j2 = zxb1Var.f287277a;
                long j3 = j2 == -9223372036854775807L ? -9223372036854775807L : (long) (((j - j2) * zxb1Var.f287279c) + zxb1Var.f287278b);
                if (j3 == -9223372036854775807L || j3 >= this.f1069q2) {
                    z = false;
                } else {
                    z = true;
                }
            } else {
                z = false;
            }
            if ((z3 || z) && !iroVar.m67519d(268435456)) {
                if (!iroVar.m67519d(67108864)) {
                    fw7 fw7Var = this.f1068p2;
                    if (fw7Var != null) {
                        ByteBuffer byteBuffer2 = (ByteBuffer) fw7Var.f74006b;
                        tad0 tad0Var = this.f239248t1;
                        tad0Var.getClass();
                        if (tad0Var.f218545b.equals("video/av01") && (byteBuffer = iroVar.f105018d) != null) {
                            boolean z4 = z3 || this.f1059b3 <= 0;
                            ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                            byteBufferAsReadOnlyBuffer.flip();
                            if (byteBuffer2.hasRemaining()) {
                                fw7Var.m42952m(p711.m69219B(byteBuffer2));
                                byteBuffer2.position(byteBuffer2.limit());
                            }
                            ArrayList arrayListM69219B = p711.m69219B(byteBufferAsReadOnlyBuffer);
                            fw7Var.m42952m(arrayListM69219B);
                            int size = arrayListM69219B.size() - 1;
                            int i = 0;
                            while (size >= 0) {
                                jqk0 jqk0Var = (jqk0) arrayListM69219B.get(size);
                                int i2 = jqk0Var.f114922a;
                                if (i2 != 2 && i2 != 15) {
                                    if ((i2 == 3 && !z4) || ((i2 != 6 && i2 != 3) || (kqk0Var = (kqk0) fw7Var.f74007c) == null)) {
                                        break;
                                    }
                                    try {
                                        nn40Var = new nn40(kqk0Var, jqk0Var);
                                    } catch (iqk0 unused) {
                                        nn40Var = null;
                                    }
                                    if (nn40Var == null || nn40Var.f156326b) {
                                        break;
                                    }
                                }
                                if (((jqk0) arrayListM69219B.get(size)).f114922a == 6 || ((jqk0) arrayListM69219B.get(size)).f114922a == 3) {
                                    i++;
                                }
                                size--;
                            }
                            if (i > 1 || size + 1 >= 8) {
                                iLimit = byteBufferAsReadOnlyBuffer.limit();
                            } else {
                                iLimit = size >= 0 ? ((jqk0) arrayListM69219B.get(size)).f114923b.limit() : byteBufferAsReadOnlyBuffer.position();
                            }
                            if (iLimit == 0) {
                                iroVar.mo51465g();
                            } else if (iLimit != byteBufferAsReadOnlyBuffer.limit()) {
                                sa8 sa8Var = this.f1072t2;
                                sa8Var.getClass();
                                if (sa8Var.f207156c + iLimit < byteBufferAsReadOnlyBuffer.capacity() && !iroVar.m67519d(1073741824)) {
                                    ByteBuffer byteBuffer3 = iroVar.f105018d;
                                    byteBuffer3.getClass();
                                    byteBuffer3.position(iLimit);
                                }
                            }
                        }
                    }
                    if (z2) {
                        if (!z3) {
                            this.f1059b3++;
                        }
                        this.f1071s2.add(Long.valueOf(iroVar.f105020f));
                    }
                    return z2;
                }
                iroVar.mo51465g();
                z2 = true;
                if (z2) {
                    if (!z3) {
                        this.f1059b3++;
                    }
                    this.f1071s2.add(Long.valueOf(iroVar.f105020f));
                }
                return z2;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002c  */
    @Override // p204p.vad0
    /* JADX INFO: renamed from: M0 */
    public final boolean mo815M0() {
        boolean z;
        if (this.f239200M1) {
            r300 r300Var = this.f239242n1;
            long j = this.f160282P0;
            if (j != -9223372036854775807L) {
                if (this.f239228c2 + 1 + j > Long.MAX_VALUE - (this.f239218X1.f228458c + j)) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = true;
            }
            loy0 loy0Var = this.f1044M2;
            if (loy0Var == null || !loy0Var.f135576c || this.f1046O2 || this.f1053V2 || ((r300Var != null && r300Var.f195389r > 0) || z || this.f239218X1.f228463h != -9223372036854775807L)) {
                return true;
            }
        }
        return false;
    }

    @Override // p204p.vad0, p204p.o09
    /* JADX INFO: renamed from: N */
    public final void mo816N(float f, float f2) {
        super.mo816N(f, f2);
        i9c1 i9c1Var = this.f1077y2;
        if (i9c1Var != null) {
            i9c1Var.mo782e(f);
        } else {
            this.f1065m2.m864g(f);
        }
        zxb1 zxb1Var = this.f1070r2;
        if (zxb1Var != null) {
            zxb1Var.m97180c(f);
        }
    }

    @Override // p204p.vad0
    /* JADX INFO: renamed from: N0 */
    public final boolean mo817N0(tad0 tad0Var) {
        return m824Z0(tad0Var);
    }

    @Override // p204p.vad0
    /* JADX INFO: renamed from: O0 */
    public final boolean mo818O0() {
        tad0 tad0Var = this.f239248t1;
        if (this.f1077y2 != null && tad0Var != null) {
            String str = tad0Var.f218544a;
            if (str.equals("c2.mtk.avc.decoder") || str.equals("c2.mtk.hevc.decoder") || str.equals("c2.mtk.vp9.decoder")) {
                return true;
            }
        }
        return super.mo818O0();
    }

    @Override // p204p.vad0
    /* JADX INFO: renamed from: Q0 */
    public final int mo819Q0(wra wraVar, r300 r300Var) {
        boolean z;
        int i = 0;
        if (!def0.m35798o(r300Var.f195387p)) {
            return o09.m65984a(0, 0, 0, 0);
        }
        int i2 = 1;
        boolean z2 = r300Var.f195391t != null;
        Context context = this.f1060h2;
        List listM802W0 = m802W0(context, wraVar, r300Var, z2, false);
        if (z2 && listM802W0.isEmpty()) {
            listM802W0 = m802W0(context, wraVar, r300Var, false, false);
        }
        if (listM802W0.isEmpty()) {
            return o09.m65984a(1, 0, 0, 0);
        }
        int i3 = r300Var.f195370T;
        if (i3 != 0 && i3 != 2) {
            return o09.m65984a(2, 0, 0, 0);
        }
        tad0 tad0Var = (tad0) listM802W0.get(0);
        boolean zM80346e = tad0Var.m80346e(context, r300Var);
        if (!zM80346e) {
            int i4 = 1;
            while (true) {
                if (i4 >= listM802W0.size()) {
                    z = true;
                    break;
                }
                tad0 tad0Var2 = (tad0) listM802W0.get(i4);
                if (tad0Var2.m80346e(context, r300Var)) {
                    z = false;
                    zM80346e = true;
                    tad0Var = tad0Var2;
                    break;
                }
                i4++;
            }
        } else {
            z = true;
            break;
        }
        int i5 = zM80346e ? 4 : 3;
        int i6 = tad0Var.m80347f(r300Var) ? 16 : 8;
        int i7 = tad0Var.f218550g ? 64 : 0;
        int i8 = z ? 128 : 0;
        if (Build.VERSION.SDK_INT >= 26 && "video/dolby-vision".equals(r300Var.f195387p) && !fz6.m43164t(context)) {
            i8 = 256;
        }
        if (zM80346e) {
            List listM802W1 = m802W0(context, wraVar, r300Var, z2, true);
            if (!listM802W1.isEmpty()) {
                HashMap map = zad0.f281041a;
                ArrayList arrayList = new ArrayList(listM802W1);
                Collections.sort(arrayList, new euf(new wad0(context, r300Var, i2), i2));
                tad0 tad0Var3 = (tad0) arrayList.get(0);
                if (tad0Var3.m80346e(context, r300Var) && tad0Var3.m80347f(r300Var)) {
                    i = 32;
                }
            }
        }
        return i5 | i6 | i | i7 | i8;
    }

    @Override // p204p.o09
    /* JADX INFO: renamed from: T */
    public final boolean mo820T(long j) {
        if (this.f239203P1 == -9223372036854775807L || j < this.f1045N2) {
            return false;
        }
        long j2 = this.f239220Y1;
        return j2 == -9223372036854775807L || j > j2;
    }

    @Override // p204p.vad0
    /* JADX INFO: renamed from: X */
    public final kro mo821X(tad0 tad0Var, r300 r300Var, r300 r300Var2, boolean z) {
        int i;
        kro kroVarM80343b = tad0Var.m80343b(r300Var, r300Var2);
        float f = r300Var.f195352B;
        float f2 = r300Var2.f195352B;
        int i2 = kroVarM80343b.f125697e;
        sa8 sa8Var = this.f1072t2;
        sa8Var.getClass();
        if (r300Var2.f195394w > sa8Var.f207154a || r300Var2.f195395x > sa8Var.f207155b) {
            i2 |= 256;
        }
        if (m803X0(tad0Var, r300Var2) > sa8Var.f207156c) {
            i2 |= 64;
        }
        if (this.f1039H2 != Integer.MIN_VALUE && (i = Build.VERSION.SDK_INT) < 31 && ((i != 30 || Build.MODEL.startsWith("MiTV")) && f != -1.0f && f2 != -1.0f && (!tad0Var.f218549f || !z))) {
            float fMax = Math.max(f2, f) / Math.min(f2, f);
            if (Math.abs(fMax - Math.round(fMax)) > 0.01f) {
                i2 |= 65536;
            }
        }
        int i3 = i2;
        return new kro(tad0Var.f218544a, r300Var, r300Var2, i3 != 0 ? 0 : kroVarM80343b.f125696d, i3);
    }

    @Override // p204p.vad0
    /* JADX INFO: renamed from: Y */
    public final MediaCodecDecoderException mo822Y(IllegalStateException illegalStateException, tad0 tad0Var) {
        Surface surface = this.f1034C2;
        MediaCodecVideoDecoderException mediaCodecVideoDecoderException = new MediaCodecVideoDecoderException(illegalStateException, tad0Var);
        System.identityHashCode(surface);
        if (surface != null) {
            surface.isValid();
        }
        return mediaCodecVideoDecoderException;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0056  */
    /* JADX WARN: Code duplicated, block: B:33:0x0059  */
    /* JADX WARN: Code duplicated, block: B:50:0x0090  */
    /* JADX WARN: Code duplicated, block: B:53:0x009b  */
    /* JADX WARN: Code duplicated, block: B:55:0x009f  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:62:0x0070 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: Y0 */
    public final Surface m823Y0(tad0 tad0Var) {
        boolean z;
        d7o0 d7o0Var;
        int i;
        RuntimeException runtimeException;
        Error error;
        i9c1 i9c1Var = this.f1077y2;
        if (i9c1Var != null) {
            return i9c1Var.mo780c();
        }
        Surface surface = this.f1034C2;
        if (surface != null) {
            return surface;
        }
        if (Build.VERSION.SDK_INT >= 35 && tad0Var.f218551h) {
            return null;
        }
        c95.m31855u(m837h1(tad0Var));
        e7o0 e7o0Var = this.f1035D2;
        if (e7o0Var != null && e7o0Var.f56965a != tad0Var.f218549f && e7o0Var != null) {
            e7o0Var.release();
            this.f1035D2 = null;
        }
        if (this.f1035D2 == null) {
            Context context = this.f1060h2;
            boolean z2 = tad0Var.f218549f;
            boolean z3 = false;
            if (z2) {
                if (!e7o0.m38065g(context)) {
                    z = false;
                }
                c95.m31855u(z);
                d7o0Var = new d7o0("ExoPlayer:PlaceholderSurface");
                if (z2) {
                    i = e7o0.f56963d;
                } else {
                    i = 0;
                }
                d7o0Var.start();
                Handler handler = new Handler(d7o0Var.getLooper(), d7o0Var);
                d7o0Var.f46244b = handler;
                d7o0Var.f46243a = new hos(handler);
                synchronized (d7o0Var) {
                    d7o0Var.f46244b.obtainMessage(1, i, 0).sendToTarget();
                    while (d7o0Var.f46247e == null && d7o0Var.f46246d == null && d7o0Var.f46245c == null) {
                        try {
                            d7o0Var.wait();
                        } catch (InterruptedException unused) {
                            z3 = true;
                        }
                    }
                }
                if (z3) {
                    Thread.currentThread().interrupt();
                }
                runtimeException = d7o0Var.f46246d;
                if (runtimeException == null) {
                    throw runtimeException;
                }
                error = d7o0Var.f46245c;
                if (error == null) {
                    throw error;
                }
                e7o0 e7o0Var2 = d7o0Var.f46247e;
                e7o0Var2.getClass();
                this.f1035D2 = e7o0Var2;
            } else {
                int i2 = e7o0.f56963d;
            }
            z = true;
            c95.m31855u(z);
            d7o0Var = new d7o0("ExoPlayer:PlaceholderSurface");
            if (z2) {
                i = e7o0.f56963d;
            } else {
                i = 0;
            }
            d7o0Var.start();
            Handler handler2 = new Handler(d7o0Var.getLooper(), d7o0Var);
            d7o0Var.f46244b = handler2;
            d7o0Var.f46243a = new hos(handler2);
            synchronized (d7o0Var) {
                d7o0Var.f46244b.obtainMessage(1, i, 0).sendToTarget();
                while (d7o0Var.f46247e == null) {
                    d7o0Var.wait();
                }
                if (z3) {
                    Thread.currentThread().interrupt();
                }
                runtimeException = d7o0Var.f46246d;
                if (runtimeException == null) {
                    throw runtimeException;
                }
                error = d7o0Var.f46245c;
                if (error == null) {
                    throw error;
                }
                e7o0 e7o0Var3 = d7o0Var.f46247e;
                e7o0Var3.getClass();
                this.f1035D2 = e7o0Var3;
            }
        }
        return this.f1035D2;
    }

    /* JADX INFO: renamed from: Z0 */
    public final boolean m824Z0(tad0 tad0Var) {
        if (this.f1077y2 != null) {
            return true;
        }
        Surface surface = this.f1034C2;
        if (surface == null || !surface.isValid()) {
            return (Build.VERSION.SDK_INT >= 35 && tad0Var.f218551h) || m837h1(tad0Var);
        }
        return true;
    }

    /* JADX INFO: renamed from: a1 */
    public final boolean m825a1(iro iroVar) {
        if (m66004p() || iroVar.m67519d(536870912)) {
            return true;
        }
        long j = this.f160282P0;
        return j == -9223372036854775807L || j - (iroVar.f105020f - this.f239218X1.f228458c) <= 100000;
    }

    /* JADX INFO: renamed from: b1 */
    public final void m826b1() {
        if (this.f1041J2 > 0) {
            this.f160293g.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j = jElapsedRealtime - this.f1040I2;
            int i = this.f1041J2;
            bka1 bka1Var = this.f1062j2;
            Handler handler = (Handler) bka1Var.f27887b;
            if (handler != null) {
                handler.post(new l5c1(bka1Var, i, j));
            }
            this.f1041J2 = 0;
            this.f1040I2 = jElapsedRealtime;
        }
    }

    @Override // p204p.vad0, p204p.o09, p204p.iap0
    /* JADX INFO: renamed from: c */
    public final void mo827c(int i, Object obj) {
        if (i == 1) {
            m830e1(obj);
            return;
        }
        if (i == 7) {
            obj.getClass();
            oxb1 oxb1Var = (oxb1) obj;
            this.f1056Y2 = oxb1Var;
            i9c1 i9c1Var = this.f1077y2;
            if (i9c1Var != null) {
                i9c1Var.mo794q(oxb1Var);
                return;
            }
            return;
        }
        if (i == 10) {
            obj.getClass();
            int iIntValue = ((Integer) obj).intValue();
            if (this.f1054W2 != iIntValue) {
                this.f1054W2 = iIntValue;
                if (this.f1053V2) {
                    m85058E0();
                    return;
                }
                return;
            }
            return;
        }
        if (i == 4) {
            obj.getClass();
            int iIntValue2 = ((Integer) obj).intValue();
            this.f1038G2 = iIntValue2;
            qad0 qad0Var = this.f239241m1;
            if (qad0Var != null) {
                qad0Var.mo28887h(iIntValue2);
                return;
            }
            return;
        }
        if (i == 5) {
            obj.getClass();
            int iIntValue3 = ((Integer) obj).intValue();
            this.f1039H2 = iIntValue3;
            i9c1 i9c1Var2 = this.f1077y2;
            if (i9c1Var2 != null) {
                i9c1Var2.mo795r(iIntValue3);
                return;
            }
            C0071e c0071e = this.f1065m2.f1080b;
            if (c0071e.f1101i == iIntValue3) {
                return;
            }
            c0071e.f1101i = iIntValue3;
            c0071e.m867c(true);
            return;
        }
        if (i == 13) {
            obj.getClass();
            List list = (List) obj;
            if (list.equals(xxb1.f266937a)) {
                i9c1 i9c1Var3 = this.f1077y2;
                if (i9c1Var3 == null || !i9c1Var3.isInitialized()) {
                    return;
                }
                this.f1077y2.mo779b();
                return;
            }
            this.f1033B2 = list;
            i9c1 i9c1Var4 = this.f1077y2;
            if (i9c1Var4 != null) {
                i9c1Var4.mo787j(list);
                return;
            }
            return;
        }
        if (i == 14) {
            obj.getClass();
            di21 di21Var = (di21) obj;
            if (di21Var.f49219a == 0 || di21Var.f49220b == 0) {
                return;
            }
            this.f1036E2 = di21Var;
            i9c1 i9c1Var5 = this.f1077y2;
            if (i9c1Var5 != null) {
                Surface surface = this.f1034C2;
                surface.getClass();
                i9c1Var5.mo790m(surface, di21Var);
                return;
            }
            return;
        }
        switch (i) {
            case 16:
                obj.getClass();
                this.f1052U2 = ((Integer) obj).intValue();
                qad0 qad0Var2 = this.f239241m1;
                if (qad0Var2 != null && Build.VERSION.SDK_INT >= 35) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("importance", Math.max(0, -this.f1052U2));
                    qad0Var2.mo28880a(bundle);
                }
                break;
            case 17:
                Surface surface2 = this.f1034C2;
                m830e1(null);
                obj.getClass();
                ((C0068b) obj).mo827c(1, surface2);
                break;
            case 18:
                loy0 loy0Var = this.f1044M2;
                boolean z = loy0Var != null && loy0Var.f135575b;
                loy0 loy0Var2 = (loy0) obj;
                this.f1044M2 = loy0Var2;
                if (z != (loy0Var2 != null && loy0Var2.f135575b)) {
                    m85063R0(this.f239242n1);
                }
                break;
            default:
                super.mo827c(i, obj);
                break;
        }
    }

    /* JADX INFO: renamed from: c1 */
    public final void m828c1() {
        qad0 qad0Var;
        if (this.f1053V2 && (qad0Var = this.f239241m1) != null) {
            this.f1055X2 = new cbd0(this, qad0Var);
            if (Build.VERSION.SDK_INT >= 33) {
                Bundle bundle = new Bundle();
                bundle.putInt("tunnel-peek", 1);
                qad0Var.mo28880a(bundle);
            }
        }
    }

    /* JADX INFO: renamed from: d1 */
    public final void m829d1(qad0 qad0Var, int i, long j) {
        Surface surface;
        Trace.beginSection("releaseOutputBuffer");
        qad0Var.mo28893n(i, j);
        Trace.endSection();
        this.f239216W1.f94497e++;
        this.f1042K2 = 0;
        if (this.f1077y2 == null) {
            k9c1 k9c1Var = this.f1050S2;
            boolean zEquals = k9c1Var.equals(k9c1.f120559d);
            bka1 bka1Var = this.f1062j2;
            if (!zEquals && !k9c1Var.equals(this.f1051T2)) {
                this.f1051T2 = k9c1Var;
                bka1Var.m29662n(k9c1Var);
            }
            C0069c c0069c = this.f1065m2;
            boolean z = c0069c.f1083e != 3;
            c0069c.f1083e = 3;
            c0069c.f1089k.getClass();
            c0069c.f1085g = h0b1.m46295W(SystemClock.elapsedRealtime());
            if (!z || (surface = this.f1034C2) == null) {
                return;
            }
            Handler handler = (Handler) bka1Var.f27887b;
            if (handler != null) {
                handler.post(new vpo(bka1Var, surface, SystemClock.elapsedRealtime(), 3));
            }
            this.f1037F2 = true;
        }
    }

    /* JADX INFO: renamed from: e1 */
    public final void m830e1(Object obj) {
        Handler handler;
        Surface surface = obj instanceof Surface ? (Surface) obj : null;
        Surface surface2 = this.f1034C2;
        bka1 bka1Var = this.f1062j2;
        if (surface2 == surface) {
            if (surface != null) {
                k9c1 k9c1Var = this.f1051T2;
                if (k9c1Var != null) {
                    bka1Var.m29662n(k9c1Var);
                }
                Surface surface3 = this.f1034C2;
                if (surface3 == null || !this.f1037F2 || (handler = (Handler) bka1Var.f27887b) == null) {
                    return;
                }
                handler.post(new vpo(bka1Var, surface3, SystemClock.elapsedRealtime(), 3));
                return;
            }
            return;
        }
        this.f1034C2 = surface;
        i9c1 i9c1Var = this.f1077y2;
        C0069c c0069c = this.f1065m2;
        if (i9c1Var == null) {
            c0069c.m863f(surface);
        }
        boolean z = false;
        this.f1037F2 = false;
        int i = this.f160294h;
        qad0 qad0Var = this.f239241m1;
        if (qad0Var != null) {
            if (this.f1077y2 == null) {
                tad0 tad0Var = this.f239248t1;
                tad0Var.getClass();
                if (!m824Z0(tad0Var) || this.f1073u2) {
                    m85058E0();
                    m85077o0();
                } else {
                    Surface surfaceM823Y0 = m823Y0(tad0Var);
                    if (surfaceM823Y0 != null) {
                        qad0Var.mo28889j(surfaceM823Y0);
                    } else {
                        if (Build.VERSION.SDK_INT < 35) {
                            throw new IllegalStateException();
                        }
                        qad0Var.mo28885f();
                    }
                    z = true;
                }
            } else {
                z = true;
            }
        }
        if (surface != null) {
            k9c1 k9c1Var2 = this.f1051T2;
            if (k9c1Var2 != null) {
                bka1Var.m29662n(k9c1Var2);
            }
        } else {
            this.f1051T2 = null;
            i9c1 i9c1Var2 = this.f1077y2;
            if (i9c1Var2 != null) {
                i9c1Var2.mo796s();
            }
        }
        if (i == 2) {
            i9c1 i9c1Var3 = this.f1077y2;
            if (i9c1Var3 != null) {
                i9c1Var3.mo799v(z);
            } else {
                c0069c.m860c(z);
            }
        }
        m828c1();
    }

    @Override // p204p.o09
    /* JADX INFO: renamed from: f */
    public final void mo831f() {
        i9c1 i9c1Var = this.f1077y2;
        if (i9c1Var == null) {
            C0069c c0069c = this.f1065m2;
            if (c0069c.f1083e == 0) {
                c0069c.f1083e = 1;
                return;
            }
            return;
        }
        int i = this.f1032A2;
        if (i == 0 || i == 1) {
            this.f1032A2 = 0;
        } else {
            i9c1Var.mo789l();
        }
    }

    @Override // p204p.vad0
    /* JADX INFO: renamed from: f0 */
    public final int mo832f0(iro iroVar) {
        if (Build.VERSION.SDK_INT < 34) {
            return 0;
        }
        loy0 loy0Var = this.f1044M2;
        return (((loy0Var == null || !loy0Var.f135578e) && !this.f1053V2) || iroVar.f105020f >= this.f160285Y || m825a1(iroVar)) ? 0 : 32;
    }

    /* JADX INFO: renamed from: f1 */
    public boolean mo833f1(long j, boolean z) {
        return j < -500000 && !z;
    }

    @Override // p204p.vad0
    /* JADX INFO: renamed from: g0 */
    public final float mo834g0(float f, r300 r300Var, r300[] r300VarArr) {
        tad0 tad0Var;
        float fM50405a = -1.0f;
        for (r300 r300Var2 : r300VarArr) {
            float f2 = r300Var2.f195352B;
            if (f2 != -1.0f) {
                fM50405a = Math.max(fM50405a, f2);
            }
        }
        if (fM50405a == -1.0f && this.f239241m1 != null) {
            iez iezVar = this.f1067o2;
            if (iezVar.m50405a() != -9223372036854775807L) {
                fM50405a = 1.0E9f / iezVar.m50405a();
            }
        }
        float f3 = fM50405a == -1.0f ? -1.0f : fM50405a * f;
        if (this.f1044M2 == null || (tad0Var = this.f239248t1) == null) {
            return f3;
        }
        int i = r300Var.f195394w;
        int i2 = r300Var.f195395x;
        float f4 = -3.4028235E38f;
        if (tad0Var.f218552i) {
            float f5 = tad0Var.f218555l;
            if (f5 != -3.4028235E38f && tad0Var.f218553j == i && tad0Var.f218554k == i2) {
                f4 = f5;
            } else {
                float f6 = 1024.0f;
                if (!tad0Var.m80348g(1024.0f, i, i2)) {
                    f4 = 0.0f;
                    while (true) {
                        float f7 = f6 - f4;
                        if (Math.abs(f7) <= 5.0f) {
                            break;
                        }
                        float f8 = (f7 / 2.0f) + f4;
                        if (tad0Var.m80348g(f8, i, i2)) {
                            f4 = f8;
                        } else {
                            f6 = f8;
                        }
                    }
                } else {
                    f4 = 1024.0f;
                }
                tad0Var.f218555l = f4;
                tad0Var.f218553j = i;
                tad0Var.f218554k = i2;
            }
        }
        return f3 != -1.0f ? Math.max(f3, f4) : f4;
    }

    /* JADX INFO: renamed from: g1 */
    public final boolean m835g1(long j, long j2, long j3, boolean z, boolean z2) {
        if (this.f1077y2 != null && this.f1061i2) {
            j2 -= -this.f1057Z2;
        }
        if (mo833f1(j, z)) {
            p1y0 p1y0Var = this.f160295i;
            p1y0Var.getClass();
            int iMo41646s = p1y0Var.mo41646s(j2 - this.f160284X);
            if (iMo41646s != 0) {
                this.f1045N2 = j2;
                boolean z3 = this.f1065m2.f1086h != -9223372036854775807L;
                PriorityQueue priorityQueue = this.f1071s2;
                Iterator it = priorityQueue.iterator();
                int i = 0;
                int i2 = 0;
                while (it.hasNext()) {
                    if (((Long) it.next()).longValue() < this.f160285Y || z3) {
                        i2++;
                    } else {
                        i++;
                    }
                }
                priorityQueue.clear();
                if (z2) {
                    hro hroVar = this.f239216W1;
                    int i3 = hroVar.f94496d + iMo41646s;
                    hroVar.f94498f += this.f1043L2;
                    hroVar.f94496d = i3 + i + i2;
                } else {
                    this.f239216W1.f94502j++;
                    m840j1(iMo41646s + i, this.f1043L2);
                    this.f239216W1.f94496d += i2;
                }
                if (m85072d0()) {
                    m85077o0();
                }
                i9c1 i9c1Var = this.f1077y2;
                if (i9c1Var != null) {
                    i9c1Var.mo797t(false);
                }
                return true;
            }
        }
        return false;
    }

    @Override // p204p.vad0
    /* JADX INFO: renamed from: h0 */
    public final ArrayList mo836h0(wra wraVar, r300 r300Var, boolean z) {
        boolean z2 = this.f1053V2;
        Context context = this.f1060h2;
        List listM802W0 = m802W0(context, wraVar, r300Var, z, z2);
        HashMap map = zad0.f281041a;
        ArrayList arrayList = new ArrayList(listM802W0);
        int i = 1;
        Collections.sort(arrayList, new euf(new wad0(context, r300Var, i), i));
        return arrayList;
    }

    /* JADX INFO: renamed from: h1 */
    public final boolean m837h1(tad0 tad0Var) {
        if (this.f1053V2 || m800U0(tad0Var.f218544a)) {
            return false;
        }
        return !tad0Var.f218549f || e7o0.m38065g(this.f1060h2);
    }

    @Override // p204p.o09
    /* JADX INFO: renamed from: i */
    public final String mo838i() {
        return "MediaCodecVideoRenderer";
    }

    /* JADX INFO: renamed from: i1 */
    public final void m839i1(qad0 qad0Var, int i) {
        Trace.beginSection("skipVideoBuffer");
        qad0Var.mo28890k(i);
        Trace.endSection();
        this.f239216W1.f94498f++;
    }

    /* JADX INFO: renamed from: j1 */
    public final void m840j1(int i, int i2) {
        hro hroVar = this.f239216W1;
        hroVar.f94500h += i;
        int i3 = i + i2;
        hroVar.f94499g += i3;
        this.f1041J2 += i3;
        int i4 = this.f1042K2 + i3;
        this.f1042K2 = i4;
        hroVar.f94501i = Math.max(i4, hroVar.f94501i);
        int i5 = this.f1063k2;
        if (i5 <= 0 || this.f1041J2 < i5) {
            return;
        }
        m826b1();
    }

    /* JADX WARN: Code duplicated, block: B:67:0x013c  */
    /* JADX WARN: Instruction removed from duplicated block: B:67:0x013c, please report this as an issue */
    @Override // p204p.vad0
    /* JADX INFO: renamed from: k0 */
    public final yho mo841k0(tad0 tad0Var, r300 r300Var, MediaCrypto mediaCrypto, float f) {
        int i;
        sa8 sa8Var;
        Point point;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        Point point2;
        byte b;
        boolean z;
        Pair pairM63005c;
        int iM801V0;
        String str = tad0Var.f218546c;
        r300[] r300VarArr = this.f160296t;
        r300VarArr.getClass();
        int i2 = r300Var.f195394w;
        float f2 = r300Var.f195352B;
        p7f p7fVar = r300Var.f195358H;
        int i3 = r300Var.f195395x;
        int iM803X0 = m803X0(tad0Var, r300Var);
        if (r300VarArr.length == 1) {
            if (iM803X0 != -1 && (iM801V0 = m801V0(tad0Var, r300Var)) != -1) {
                iM803X0 = Math.min((int) (iM803X0 * 1.5f), iM801V0);
            }
            sa8Var = new sa8(i2, i3, iM803X0, false);
            p7fVar = p7fVar;
            i = i3;
        } else {
            int length = r300VarArr.length;
            int iMax = i2;
            int iMax2 = i3;
            int i4 = 0;
            boolean z2 = false;
            while (i4 < length) {
                r300 r300Var2 = r300VarArr[i4];
                r300[] r300VarArr2 = r300VarArr;
                if (p7fVar != null && r300Var2.f195358H == null) {
                    p300 p300VarM74564a = r300Var2.m74564a();
                    p300VarM74564a.f173500G = p7fVar;
                    r300Var2 = new r300(p300VarM74564a);
                }
                kro kroVarM80343b = tad0Var.m80343b(r300Var, r300Var2);
                int i5 = length;
                int i6 = r300Var2.f195395x;
                if (kroVarM80343b.f125696d != 0) {
                    int i7 = r300Var2.f195394w;
                    b = -1;
                    z2 |= i7 == -1 || i6 == -1;
                    iMax = Math.max(iMax, i7);
                    iMax2 = Math.max(iMax2, i6);
                    iM803X0 = Math.max(iM803X0, m803X0(tad0Var, r300Var2));
                } else {
                    b = -1;
                }
                length = i5;
                i4++;
                r300VarArr = r300VarArr2;
            }
            if (z2) {
                yif1.m93819w0("Resolutions unknown. Codec max resolution: " + iMax + "x" + iMax2);
                boolean z3 = i3 > i2;
                int i8 = z3 ? i3 : i2;
                int i9 = z3 ? i2 : i3;
                boolean z4 = z3;
                float f3 = i9 / i8;
                int i10 = 0;
                while (true) {
                    if (i10 < 9) {
                        int i11 = f1029c3[i10];
                        int i12 = i10;
                        int i13 = (int) (i11 * f3);
                        if (i11 > i8 && i13 > i9) {
                            if (z4) {
                                i11 = i13;
                            }
                            if (z4) {
                                i13 = i11;
                            }
                            int i14 = i8;
                            MediaCodecInfo.CodecCapabilities codecCapabilities = tad0Var.f218547d;
                            if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
                                point2 = null;
                            } else {
                                int widthAlignment = videoCapabilities.getWidthAlignment();
                                int heightAlignment = videoCapabilities.getHeightAlignment();
                                point2 = new Point(h0b1.m46311g(i11, widthAlignment) * widthAlignment, h0b1.m46311g(i13, heightAlignment) * heightAlignment);
                            }
                            if (point2 != null) {
                                point = point2;
                                i = i3;
                                if (tad0Var.m80348g(f2, point2.x, point2.y)) {
                                }
                            } else {
                                i = i3;
                            }
                            i10 = i12 + 1;
                            i3 = i;
                            i8 = i14;
                            p7fVar = p7fVar;
                            i9 = i9;
                        }
                        if (point != null) {
                            iMax = Math.max(iMax, point.x);
                            iMax2 = Math.max(iMax2, point.y);
                            p300 p300VarM74564a2 = r300Var.m74564a();
                            p300VarM74564a2.f173534v = iMax;
                            p300VarM74564a2.f173535w = iMax2;
                            iM803X0 = Math.max(iM803X0, m801V0(tad0Var, new r300(p300VarM74564a2)));
                            yif1.m93819w0("Codec max resolution adjusted to: " + iMax + "x" + iMax2);
                        }
                    }
                    p7fVar = p7fVar;
                    i = i3;
                    point = null;
                    if (point != null) {
                        iMax = Math.max(iMax, point.x);
                        iMax2 = Math.max(iMax2, point.y);
                        p300 p300VarM74564a3 = r300Var.m74564a();
                        p300VarM74564a3.f173534v = iMax;
                        p300VarM74564a3.f173535w = iMax2;
                        iM803X0 = Math.max(iM803X0, m801V0(tad0Var, new r300(p300VarM74564a3)));
                        yif1.m93819w0("Codec max resolution adjusted to: " + iMax + "x" + iMax2);
                    }
                }
            } else {
                p7fVar = p7fVar;
                i = i3;
            }
            sa8Var = new sa8(iMax, iMax2, iM803X0, false);
        }
        this.f1072t2 = sa8Var;
        int i15 = this.f1053V2 ? this.f1054W2 : 0;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", i2);
        mediaFormat.setInteger("height", i);
        lzj.m60358e0(mediaFormat, r300Var.f195390s);
        if (f2 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f2);
        }
        lzj.m60340R(mediaFormat, "rotation-degrees", r300Var.f195353C);
        lzj.m60339Q(mediaFormat, p7fVar);
        if ("video/dolby-vision".equals(r300Var.f195387p) && (pairM63005c = mwe.m63005c(r300Var)) != null) {
            lzj.m60340R(mediaFormat, "profile", ((Integer) pairM63005c.first).intValue());
        }
        mediaFormat.setInteger("max-width", sa8Var.f207154a);
        mediaFormat.setInteger("max-height", sa8Var.f207155b);
        lzj.m60340R(mediaFormat, "max-input-size", sa8Var.f207156c);
        mediaFormat.setInteger("priority", 0);
        if (f != -1.0f) {
            mediaFormat.setFloat("operating-rate", f);
        }
        if (this.f1064l2) {
            z = true;
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        } else {
            z = true;
        }
        if (i15 != 0) {
            mediaFormat.setFeatureEnabled("tunneled-playback", z);
            mediaFormat.setInteger("audio-session-id", i15);
        }
        if (Build.VERSION.SDK_INT >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.f1052U2));
        }
        m85066V(mediaFormat);
        Surface surfaceM823Y0 = m823Y0(tad0Var);
        if (this.f1077y2 != null && !h0b1.m46289Q(this.f1060h2)) {
            mediaFormat.setInteger("allow-frame-drop", 0);
        }
        return new yho(tad0Var, mediaFormat, r300Var, surfaceM823Y0, mediaCrypto, (Object) null, 25);
    }

    /* JADX INFO: renamed from: k1 */
    public final void m842k1(long j) {
        hro hroVar = this.f239216W1;
        hroVar.f94503k += j;
        hroVar.f94504l++;
        this.f1047P2 += j;
        this.f1048Q2++;
    }

    @Override // p204p.vad0
    /* JADX INFO: renamed from: l0 */
    public final void mo843l0(iro iroVar) {
        ByteBuffer byteBuffer = iroVar.f105021g;
        if (byteBuffer != null && byteBuffer.remaining() >= 7) {
            byte b = byteBuffer.get();
            short s = byteBuffer.getShort();
            short s2 = byteBuffer.getShort();
            byte b2 = byteBuffer.get();
            byte b3 = byteBuffer.get();
            byteBuffer.position(0);
            if (b == -75 && s == 60 && s2 == 1 && b2 == 4 && (b3 == 0 || b3 == 1)) {
                if (this.f1075w2) {
                    byte[] bArr = new byte[byteBuffer.remaining()];
                    byteBuffer.get(bArr);
                    byteBuffer.position(0);
                    qad0 qad0Var = this.f239241m1;
                    qad0Var.getClass();
                    Bundle bundle = new Bundle();
                    bundle.putByteArray("hdr10-plus-info", bArr);
                    qad0Var.mo28880a(bundle);
                    return;
                }
                return;
            }
            if (Build.VERSION.SDK_INT >= 37 && b == -75 && s == 144 && s2 == 1) {
                byteBuffer.position(5);
                int iRemaining = byteBuffer.remaining();
                byte[] bArr2 = new byte[iRemaining];
                byteBuffer.get(bArr2);
                byteBuffer.position(0);
                boolean z = iRemaining > 0;
                this.f1076x2 = z;
                if (z) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putByteArray("hdr-st2094-50-info", bArr2);
                    qad0 qad0Var2 = this.f239241m1;
                    qad0Var2.getClass();
                    qad0Var2.mo28880a(bundle2);
                }
            }
        }
    }

    @Override // p204p.vad0
    /* JADX INFO: renamed from: q0 */
    public final boolean mo844q0(r300 r300Var) throws ExoPlaybackException {
        i9c1 i9c1Var = this.f1077y2;
        if (i9c1Var == null || i9c1Var.isInitialized()) {
            return true;
        }
        try {
            return this.f1077y2.mo784g(r300Var);
        } catch (VideoSink$VideoSinkException e) {
            throw m65998b(e, r300Var, false, 7000);
        }
    }

    @Override // p204p.vad0
    /* JADX INFO: renamed from: r0 */
    public final void mo845r0(Exception exc) {
        yif1.m93810s("Video codec error", exc);
        bka1 bka1Var = this.f1062j2;
        Handler handler = (Handler) bka1Var.f27887b;
        if (handler != null) {
            handler.post(new b381(5, bka1Var, exc));
        }
    }

    @Override // p204p.vad0
    /* JADX INFO: renamed from: s0 */
    public final void mo846s0(long j, String str, long j2) {
        String str2;
        boolean z;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        bka1 bka1Var = this.f1062j2;
        Handler handler = (Handler) bka1Var.f27887b;
        if (handler != null) {
            str2 = str;
            handler.post(new h57(bka1Var, str2, j, j2, 1));
        } else {
            str2 = str;
        }
        this.f1073u2 = m800U0(str2);
        tad0 tad0Var = this.f239248t1;
        tad0Var.getClass();
        boolean z2 = false;
        if (Build.VERSION.SDK_INT >= 29 && "video/x-vnd.on2.vp9".equals(tad0Var.f218545b)) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = tad0Var.f218547d;
            if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
            }
            int length = codecProfileLevelArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    z = false;
                    break;
                } else {
                    if (codecProfileLevelArr[i].profile == 16384) {
                        z = true;
                        break;
                    }
                    i++;
                }
            }
        } else {
            z = false;
            break;
        }
        this.f1075w2 = z;
        if (Build.VERSION.SDK_INT < 37) {
            tad0 tad0Var2 = this.f239248t1;
            tad0Var2.getClass();
            if (tad0Var2.f218545b.equals("video/av01")) {
                z2 = true;
            }
        }
        this.f1074v2 = z2;
        m828c1();
    }

    @Override // p204p.o09
    /* JADX INFO: renamed from: t */
    public final boolean mo847t() {
        if (!this.f239208S1) {
            return false;
        }
        i9c1 i9c1Var = this.f1077y2;
        return i9c1Var == null || i9c1Var.mo781d();
    }

    @Override // p204p.vad0
    /* JADX INFO: renamed from: t0 */
    public final void mo848t0(kwe kweVar) {
        bka1 bka1Var = this.f1062j2;
        Handler handler = (Handler) bka1Var.f27887b;
        if (handler != null) {
            handler.post(new b381(6, bka1Var, kweVar));
        }
    }

    @Override // p204p.vad0
    /* JADX INFO: renamed from: u0 */
    public final void mo849u0(String str) {
        bka1 bka1Var = this.f1062j2;
        Handler handler = (Handler) bka1Var.f27887b;
        if (handler != null) {
            handler.post(new b381(3, bka1Var, str));
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003d  */
    @Override // p204p.o09
    /* JADX INFO: renamed from: v */
    public final boolean mo850v() {
        boolean zIsReady;
        boolean z = false;
        if (this.f239229d1 != null) {
            if (m66004p()) {
                zIsReady = this.f160278L0;
            } else {
                p1y0 p1y0Var = this.f160295i;
                p1y0Var.getClass();
                zIsReady = p1y0Var.isReady();
            }
            if (zIsReady) {
                z = true;
            } else {
                if (this.f239191D1 >= 0) {
                    z = true;
                } else if (this.f239189B1 != -9223372036854775807L) {
                    this.f160293g.getClass();
                    if (SystemClock.elapsedRealtime() < this.f239189B1) {
                        z = true;
                    }
                }
            }
        }
        i9c1 i9c1Var = this.f1077y2;
        if (i9c1Var != null) {
            return i9c1Var.mo788k(z);
        }
        if (z && (this.f239241m1 == null || this.f1053V2)) {
            return true;
        }
        return this.f1065m2.m859b(z);
    }

    @Override // p204p.vad0
    /* JADX INFO: renamed from: v0 */
    public final kro mo851v0(xyx xyxVar) {
        kro kroVarMo851v0 = super.mo851v0(xyxVar);
        this.f1076x2 = false;
        r300 r300Var = (r300) xyxVar.f267437c;
        r300Var.getClass();
        bka1 bka1Var = this.f1062j2;
        Handler handler = (Handler) bka1Var.f27887b;
        if (handler != null) {
            handler.post(new kgd0(bka1Var, r300Var, kroVarMo851v0, 20));
        }
        zxb1 zxb1Var = this.f1070r2;
        if (zxb1Var != null) {
            zxb1Var.m97179b();
        }
        return kroVarMo851v0;
    }

    @Override // p204p.vad0
    /* JADX INFO: renamed from: w0 */
    public final void mo852w0(r300 r300Var, MediaFormat mediaFormat) {
        int integer;
        int i;
        qad0 qad0Var = this.f239241m1;
        if (qad0Var != null) {
            qad0Var.mo28887h(this.f1038G2);
        }
        if (this.f1053V2) {
            i = r300Var.f195394w;
            integer = r300Var.f195395x;
        } else {
            mediaFormat.getClass();
            boolean z = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            int integer2 = z ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
            integer = z ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
            i = integer2;
        }
        float f = r300Var.f195355E;
        int i2 = r300Var.f195353C;
        if (i2 == 90 || i2 == 270) {
            f = 1.0f / f;
            int i3 = integer;
            integer = i;
            i = i3;
        }
        this.f1050S2 = new k9c1(i, integer, f);
        i9c1 i9c1Var = this.f1077y2;
        if (i9c1Var == null || !this.f1058a3) {
            float f2 = r300Var.f195352B;
            iez iezVar = this.f1067o2;
            iezVar.f101590f = f2;
            iezVar.f101585a.m47315c();
            iezVar.f101586b.m47315c();
            iezVar.f101587c = false;
            iezVar.f101588d = -9223372036854775807L;
            iezVar.f101589e = 0;
            iezVar.m50407c();
        } else {
            if (i <= 0 || integer <= 0) {
                return;
            }
            p300 p300VarM74564a = r300Var.m74564a();
            p300VarM74564a.f173534v = i;
            p300VarM74564a.f173535w = integer;
            p300VarM74564a.f173497D = f;
            r300 r300Var2 = new r300(p300VarM74564a);
            int i4 = this.f1032A2;
            List list = this.f1033B2;
            if (list == null) {
                kf40 kf40Var = pf40.f176960b;
                list = wsv0.f254763e;
            }
            i9c1Var.mo792o(i4, this.f239218X1.f228457b, list, r300Var2);
            this.f1032A2 = 2;
        }
        this.f1058a3 = false;
    }

    @Override // p204p.vad0, p204p.o09
    /* JADX INFO: renamed from: x */
    public final void mo853x() {
        hro hroVar;
        bka1 bka1Var = this.f1062j2;
        this.f1051T2 = null;
        m828c1();
        this.f1037F2 = false;
        this.f1055X2 = null;
        this.f1046O2 = mo815M0();
        try {
            super.mo853x();
            hroVar = this.f239216W1;
            bka1Var.getClass();
            synchronized (hroVar) {
            }
        } finally {
            hroVar = this.f239216W1;
            bka1Var.getClass();
            synchronized (hroVar) {
                Handler handler = (Handler) bka1Var.f27887b;
                if (handler != null) {
                    handler.post(new m5c1(bka1Var, hroVar, 1));
                }
                bka1Var.m29662n(k9c1.f120559d);
            }
        }
    }

    @Override // p204p.o09
    /* JADX INFO: renamed from: y */
    public final void mo854y(boolean z, boolean z2) {
        i9c1 i9c1Var;
        this.f239216W1 = new hro();
        qkw0 qkw0Var = this.f160290d;
        qkw0Var.getClass();
        boolean z3 = qkw0Var.f189662b;
        c95.m31855u((z3 && this.f1054W2 == 0) ? false : true);
        if (this.f1053V2 != z3) {
            this.f1053V2 = z3;
            m85058E0();
        }
        hro hroVar = this.f239216W1;
        bka1 bka1Var = this.f1062j2;
        Handler handler = (Handler) bka1Var.f27887b;
        if (handler != null) {
            handler.post(new m5c1(bka1Var, hroVar, 0));
        }
        boolean z4 = this.f1078z2;
        C0069c c0069c = this.f1065m2;
        if (!z4) {
            if (this.f1033B2 != null && this.f1077y2 == null) {
                z5p0 z5p0Var = new z5p0(this.f1060h2, c0069c);
                z5p0Var.f279600d = true;
                long j = this.f1069q2;
                z5p0Var.f279603g = j != -9223372036854775807L ? -j : -9223372036854775807L;
                gh61 gh61Var = this.f160293g;
                gh61Var.getClass();
                z5p0Var.f279601e = gh61Var;
                c95.m31855u(!z5p0Var.f279602f);
                if (z5p0Var.f279599c == null) {
                    z5p0Var.f279599c = new oci0();
                }
                f6p0 f6p0Var = new f6p0(z5p0Var);
                z5p0Var.f279602f = true;
                if (1 >= f6p0Var.f66482z) {
                    f6p0Var.f66482z = 1;
                }
                SparseArray sparseArray = f6p0Var.f66459c;
                if (h0b1.m46321l(sparseArray, 0)) {
                    i9c1Var = (i9c1) sparseArray.get(0);
                } else {
                    c6p0 c6p0Var = new c6p0(f6p0Var, f6p0Var.f66457a);
                    f6p0Var.f66464h.add(c6p0Var);
                    sparseArray.put(0, c6p0Var);
                    i9c1Var = c6p0Var;
                }
                this.f1077y2 = i9c1Var;
            }
            this.f1078z2 = true;
        }
        i9c1 i9c1Var2 = this.f1077y2;
        if (i9c1Var2 == null) {
            gh61 gh61Var2 = this.f160293g;
            gh61Var2.getClass();
            c0069c.f1089k = gh61Var2;
            c0069c.m862e(!z2 ? 1 : 0);
            return;
        }
        i9c1Var2.mo783f(new abd0(this));
        oxb1 oxb1Var = this.f1056Y2;
        if (oxb1Var != null) {
            this.f1077y2.mo794q(oxb1Var);
        }
        if (this.f1034C2 != null && !this.f1036E2.equals(di21.f49218c)) {
            this.f1077y2.mo790m(this.f1034C2, this.f1036E2);
        }
        this.f1077y2.mo795r(this.f1039H2);
        this.f1077y2.mo782e(this.f239239k1);
        List list = this.f1033B2;
        if (list != null) {
            this.f1077y2.mo787j(list);
        }
        this.f1032A2 = !z2 ? 1 : 0;
        this.f239224a2 = true;
    }

    @Override // p204p.vad0
    /* JADX INFO: renamed from: y0 */
    public final void mo855y0(long j) {
        super.mo855y0(j);
        if (this.f1053V2) {
            return;
        }
        this.f1043L2--;
    }

    @Override // p204p.vad0, p204p.o09
    /* JADX INFO: renamed from: z */
    public final void mo856z(long j, boolean z, boolean z2) {
        i9c1 i9c1Var = this.f1077y2;
        if (i9c1Var != null && !z) {
            i9c1Var.mo797t(true);
        }
        if (z2) {
            this.f1045N2 = j;
        }
        super.mo856z(j, z, z2);
        i9c1 i9c1Var2 = this.f1077y2;
        C0069c c0069c = this.f1065m2;
        if (i9c1Var2 == null) {
            c0069c.f1080b.m866b();
            c0069c.f1084f = -9223372036854775807L;
            c0069c.f1083e = Math.min(c0069c.f1083e, 1);
            c0069c.f1086h = -9223372036854775807L;
            c0069c.f1091m = false;
        }
        zxb1 zxb1Var = this.f1070r2;
        if (zxb1Var != null) {
            zxb1Var.m97179b();
        }
        if (z) {
            i9c1 i9c1Var3 = this.f1077y2;
            if (i9c1Var3 != null) {
                i9c1Var3.mo799v(false);
            } else {
                c0069c.m860c(false);
            }
        }
        m828c1();
        this.f1042K2 = 0;
    }

    @Override // p204p.vad0
    /* JADX INFO: renamed from: z0 */
    public final void mo857z0() {
        i9c1 i9c1Var = this.f1077y2;
        if (i9c1Var != null) {
            i9c1Var.mo778a();
            if (this.f1057Z2 == -9223372036854775807L) {
                this.f1057Z2 = this.f239218X1.f228457b;
            }
            this.f1077y2.mo786i(-this.f1057Z2);
        } else {
            this.f1065m2.m862e(2);
        }
        this.f1058a3 = true;
        m828c1();
    }
}
