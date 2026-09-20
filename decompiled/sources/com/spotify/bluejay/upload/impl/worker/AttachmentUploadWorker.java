package com.spotify.bluejay.upload.impl.worker;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.spotify.base.java.logging.Logger;
import com.spotify.bluejay.data.api.AttachmentUploadException;
import java.io.File;
import java.util.Collections;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import p204p.ayd0;
import p204p.b890;
import p204p.bga;
import p204p.bp6;
import p204p.cp6;
import p204p.cuw0;
import p204p.d890;
import p204p.fbk;
import p204p.gea1;
import p204p.ibk;
import p204p.lo6;
import p204p.op6;
import p204p.pft0;
import p204p.pnq0;
import p204p.pqm0;
import p204p.qco;
import p204p.qfa1;
import p204p.rfa1;
import p204p.s1h1;
import p204p.sco;
import p204p.sfa1;
import p204p.urv0;
import p204p.wj0;
import p204p.yuk;
import p204p.zn91;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\nB%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, m24212d2 = {"Lcom/spotify/bluejay/upload/impl/worker/AttachmentUploadWorker;", "Landroidx/work/CoroutineWorker;", "Lp/lo6;", "attachmentApiClient", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParameters", "<init>", "(Lp/lo6;Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "p/xon", "src_main_java_com_spotify_bluejay_upload_impl-impl"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class AttachmentUploadWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: g */
    public final lo6 f3105g;

    public AttachmentUploadWorker(lo6 lo6Var, Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f3105g = lo6Var;
    }

    /* JADX WARN: Code duplicated, block: B:115:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:119:0x020a A[Catch: all -> 0x003f, LOOP:2: B:117:0x0207->B:119:0x020a, LOOP_END, TryCatch #15 {all -> 0x003f, blocks: (B:13:0x0039, B:87:0x0177, B:90:0x0194, B:95:0x01a7, B:113:0x01d5, B:116:0x01f5, B:119:0x020a, B:120:0x0218, B:123:0x0225, B:126:0x0274, B:127:0x0282, B:130:0x028f), top: B:140:0x0031 }] */
    /* JADX WARN: Code duplicated, block: B:126:0x0274 A[Catch: all -> 0x003f, LOOP:1: B:124:0x0271->B:126:0x0274, LOOP_END, TryCatch #15 {all -> 0x003f, blocks: (B:13:0x0039, B:87:0x0177, B:90:0x0194, B:95:0x01a7, B:113:0x01d5, B:116:0x01f5, B:119:0x020a, B:120:0x0218, B:123:0x0225, B:126:0x0274, B:127:0x0282, B:130:0x028f), top: B:140:0x0031 }] */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code duplicated, block: B:90:0x0194 A[Catch: all -> 0x003f, CancellationException -> 0x004a, Exception -> 0x01a2, AttachmentUploadException -> 0x01a4, LOOP:0: B:88:0x0191->B:90:0x0194, LOOP_END, TryCatch #10 {CancellationException -> 0x004a, blocks: (B:13:0x0039, B:87:0x0177, B:90:0x0194, B:95:0x01a7), top: B:138:0x0039 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v17, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.StringBuilder] */
    @Override // androidx.work.CoroutineWorker
    /* JADX INFO: renamed from: f */
    public final Object mo750f(fbk fbkVar) throws Throwable {
        op6 op6Var;
        int i;
        File file;
        ?? r4;
        ?? r5;
        Object cp6Var;
        String str;
        String message;
        pqm0[] pqm0VarArr;
        qco qcoVar;
        int i2;
        pqm0[] pqm0VarArr2;
        qco qcoVar2;
        int i3;
        pqm0[] pqm0VarArr3;
        qco qcoVar3;
        int i4;
        if (fbkVar instanceof op6) {
            op6Var = (op6) fbkVar;
            int i5 = op6Var.f167765e;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                op6Var.f167765e = i5 - Integer.MIN_VALUE;
            } else {
                op6Var = new op6(this, (ibk) fbkVar);
            }
        } else {
            op6Var = new op6(this, (ibk) fbkVar);
        }
        op6 op6Var2 = op6Var;
        Object objM76978s = op6Var2.f167763c;
        ?? r1 = op6Var2.f167765e;
        ?? r13 = 3;
        ?? r14 = 3;
        try {
            if (r1 != 0) {
                if (r1 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                file = op6Var2.f167762b;
                String str2 = op6Var2.f167761a;
                try {
                    try {
                        bga.m29073P(objM76978s);
                        i = 0;
                        str = str2;
                        try {
                            pqm0VarArr3 = new pqm0[]{pft0.m69840u("attachment_id", ((gea1) objM76978s).m44463a()), pft0.m69840u("file_name", str)};
                            qcoVar3 = new qco(i);
                            for (i4 = i; i4 < 2; i4++) {
                                pqm0 pqm0Var = pqm0VarArr3[i4];
                                qcoVar3.m72560c(pqm0Var.f180351b, (String) pqm0Var.f180350a);
                            }
                            d890 d890Var = new d890(qcoVar3.m72559a());
                            file.delete();
                            return d890Var;
                        } catch (AttachmentUploadException e) {
                            e = e;
                            r5 = str;
                            Logger.m3973i("Upload failed for file=" + r5 + " reason=" + e.f3100a + " serverMessage=" + e.f3101b + " statusCode=" + e.f3102c, new Object[i]);
                            pqm0VarArr2 = new pqm0[]{pft0.m69840u("error_reason", e.f3100a), pft0.m69840u("error_message", e.f3101b), pft0.m69840u("file_name", r5)};
                            qcoVar2 = new qco(i);
                            for (i3 = i; i3 < 3; i3++) {
                                pqm0 pqm0Var2 = pqm0VarArr2[i3];
                                qcoVar2.m72560c(pqm0Var2.f180351b, (String) pqm0Var2.f180350a);
                            }
                            b890 b890Var = new b890(qcoVar2.m72559a());
                            file.delete();
                            return b890Var;
                        } catch (Exception e2) {
                            e = e2;
                            r4 = str;
                            Logger.m3974j(e, "Upload failed for file=" + r4, new Object[i]);
                            pqm0 pqm0VarM69840u = pft0.m69840u("error_reason", "");
                            message = e.getMessage();
                            if (message == null) {
                                message = "Upload failed";
                            }
                            pqm0VarArr = new pqm0[]{pqm0VarM69840u, pft0.m69840u("error_message", message), pft0.m69840u("file_name", r4)};
                            qcoVar = new qco(i);
                            for (i2 = i; i2 < 3; i2++) {
                                pqm0 pqm0Var3 = pqm0VarArr[i2];
                                qcoVar.m72560c(pqm0Var3.f180351b, (String) pqm0Var3.f180350a);
                            }
                            b890 b890Var2 = new b890(qcoVar.m72559a());
                            file.delete();
                            return b890Var2;
                        }
                    } catch (CancellationException e3) {
                        throw e3;
                    }
                } catch (AttachmentUploadException e4) {
                    e = e4;
                    i = 0;
                    r5 = str2;
                    Logger.m3973i("Upload failed for file=" + r5 + " reason=" + e.f3100a + " serverMessage=" + e.f3101b + " statusCode=" + e.f3102c, new Object[i]);
                    pqm0VarArr2 = new pqm0[]{pft0.m69840u("error_reason", e.f3100a), pft0.m69840u("error_message", e.f3101b), pft0.m69840u("file_name", r5)};
                    qcoVar2 = new qco(i);
                    while (i3 < 3) {
                        pqm0 pqm0Var4 = pqm0VarArr2[i3];
                        qcoVar2.m72560c(pqm0Var4.f180351b, (String) pqm0Var4.f180350a);
                    }
                    b890 b890Var3 = new b890(qcoVar2.m72559a());
                    file.delete();
                    return b890Var3;
                } catch (Exception e5) {
                    e = e5;
                    i = 0;
                    r4 = str2;
                    Logger.m3974j(e, "Upload failed for file=" + r4, new Object[i]);
                    pqm0 pqm0VarM69840u2 = pft0.m69840u("error_reason", "");
                    message = e.getMessage();
                    if (message == null) {
                        message = "Upload failed";
                    }
                    pqm0VarArr = new pqm0[]{pqm0VarM69840u2, pft0.m69840u("error_message", message), pft0.m69840u("file_name", r4)};
                    qcoVar = new qco(i);
                    while (i2 < 3) {
                        pqm0 pqm0Var5 = pqm0VarArr[i2];
                        qcoVar.m72560c(pqm0Var5.f180351b, (String) pqm0Var5.f180350a);
                    }
                    b890 b890Var4 = new b890(qcoVar.m72559a());
                    file.delete();
                    return b890Var4;
                }
            }
            bga.m29073P(objM76978s);
            WorkerParameters workerParameters = this.f66917b;
            sco scoVar = workerParameters.f1404b;
            sco scoVar2 = workerParameters.f1404b;
            String strM77815d = scoVar.m77815d("file_path");
            if (strM77815d == null) {
                return new b890();
            }
            String strM77815d2 = scoVar2.m77815d("content_type");
            if (strM77815d2 == null) {
                return new b890();
            }
            String strM77815d3 = scoVar2.m77815d("file_name");
            if (strM77815d3 == null) {
                return new b890();
            }
            String strM77815d4 = scoVar2.m77815d("file_type");
            if (strM77815d4 == null) {
                strM77815d4 = "";
            }
            sfa1 sfa1VarM70448a = pnq0.m70448a(strM77815d4);
            if (sfa1VarM70448a == null) {
                return new b890();
            }
            Object obj = Collections.unmodifiableMap(scoVar2.f207773a).get("page_count");
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            Object obj2 = Collections.unmodifiableMap(scoVar2.f207773a).get("character_count");
            Integer num2 = obj2 instanceof Integer ? (Integer) obj2 : null;
            if (strM77815d2.length() == 0) {
                Logger.m3973i("Could not determine content type for file=".concat(strM77815d3), new Object[0]);
                pqm0[] pqm0VarArr4 = {pft0.m69840u("error_reason", "UNSUPPORTED_CONTENT_TYPE"), pft0.m69840u("error_message", "Could not determine file type"), pft0.m69840u("file_name", strM77815d3)};
                qco qcoVar4 = new qco(0);
                for (int i6 = 0; i6 < 3; i6++) {
                    pqm0 pqm0Var6 = pqm0VarArr4[i6];
                    qcoVar4.m72560c(pqm0Var6.f180351b, (String) pqm0Var6.f180350a);
                }
                return new b890(qcoVar4.m72559a());
            }
            i = 0;
            File file2 = new File(strM77815d);
            if (!file2.exists() || file2.length() == 0) {
                Logger.m3973i("File missing or empty: ".concat(strM77815d), new Object[0]);
                pqm0[] pqm0VarArr5 = {pft0.m69840u("error_reason", ""), pft0.m69840u("error_message", "File not found"), pft0.m69840u("file_name", strM77815d3)};
                qco qcoVar5 = new qco(0);
                for (int i7 = 0; i7 < 3; i7++) {
                    pqm0 pqm0Var7 = pqm0VarArr5[i7];
                    qcoVar5.m72560c(pqm0Var7.f180351b, (String) pqm0Var7.f180350a);
                }
                return new b890(qcoVar5.m72559a());
            }
            try {
                try {
                    urv0 urv0Var = ayd0.f21209e;
                    try {
                        cuw0 cuw0Var = new cuw0(zn91.m96520H(strM77815d2), file2);
                        try {
                            if (sfa1VarM70448a instanceof rfa1) {
                                try {
                                    cp6Var = new cp6(num, num2);
                                } catch (AttachmentUploadException e6) {
                                    e = e6;
                                    file = file2;
                                    r5 = strM77815d3;
                                    Logger.m3973i("Upload failed for file=" + r5 + " reason=" + e.f3100a + " serverMessage=" + e.f3101b + " statusCode=" + e.f3102c, new Object[i]);
                                    pqm0VarArr2 = new pqm0[]{pft0.m69840u("error_reason", e.f3100a), pft0.m69840u("error_message", e.f3101b), pft0.m69840u("file_name", r5)};
                                    qcoVar2 = new qco(i);
                                    while (i3 < 3) {
                                        pqm0 pqm0Var8 = pqm0VarArr2[i3];
                                        qcoVar2.m72560c(pqm0Var8.f180351b, (String) pqm0Var8.f180350a);
                                    }
                                    b890 b890Var5 = new b890(qcoVar2.m72559a());
                                    file.delete();
                                    return b890Var5;
                                } catch (Exception e7) {
                                    e = e7;
                                    file = file2;
                                    r4 = strM77815d3;
                                    Logger.m3974j(e, "Upload failed for file=" + r4, new Object[i]);
                                    pqm0 pqm0VarM69840u3 = pft0.m69840u("error_reason", "");
                                    message = e.getMessage();
                                    if (message == null) {
                                        message = "Upload failed";
                                    }
                                    pqm0VarArr = new pqm0[]{pqm0VarM69840u3, pft0.m69840u("error_message", message), pft0.m69840u("file_name", r4)};
                                    qcoVar = new qco(i);
                                    while (i2 < 3) {
                                        pqm0 pqm0Var9 = pqm0VarArr[i2];
                                        qcoVar.m72560c(pqm0Var9.f180351b, (String) pqm0Var9.f180350a);
                                    }
                                    b890 b890Var6 = new b890(qcoVar.m72559a());
                                    file.delete();
                                    return b890Var6;
                                }
                            } else {
                                if (!(sfa1VarM70448a instanceof qfa1)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                cp6Var = bp6.f29328a;
                            }
                            wj0 wj0Var = new wj0(10, (Object) this, (Object) file2, (Object) cuw0Var, cp6Var, strM77815d2, (fbk) null);
                            op6Var2.f167761a = strM77815d3;
                            op6Var2.f167762b = file2;
                            op6Var2.f167765e = 1;
                            objM76978s = s1h1.m76978s(300000L, wj0Var, op6Var2);
                            yuk yukVar = yuk.f276404a;
                            if (objM76978s == yukVar) {
                                return yukVar;
                            }
                            file = file2;
                            str = strM77815d3;
                            pqm0VarArr3 = new pqm0[]{pft0.m69840u("attachment_id", ((gea1) objM76978s).m44463a()), pft0.m69840u("file_name", str)};
                            qcoVar3 = new qco(i);
                            while (i4 < 2) {
                                pqm0 pqm0Var10 = pqm0VarArr3[i4];
                                qcoVar3.m72560c(pqm0Var10.f180351b, (String) pqm0Var10.f180350a);
                            }
                            d890 d890Var2 = new d890(qcoVar3.m72559a());
                            file.delete();
                            return d890Var2;
                        } catch (AttachmentUploadException e8) {
                            e = e8;
                            file = file2;
                            r5 = r14;
                            Logger.m3973i("Upload failed for file=" + r5 + " reason=" + e.f3100a + " serverMessage=" + e.f3101b + " statusCode=" + e.f3102c, new Object[i]);
                            pqm0VarArr2 = new pqm0[]{pft0.m69840u("error_reason", e.f3100a), pft0.m69840u("error_message", e.f3101b), pft0.m69840u("file_name", r5)};
                            qcoVar2 = new qco(i);
                            while (i3 < 3) {
                                pqm0 pqm0Var11 = pqm0VarArr2[i3];
                                qcoVar2.m72560c(pqm0Var11.f180351b, (String) pqm0Var11.f180350a);
                            }
                            b890 b890Var7 = new b890(qcoVar2.m72559a());
                            file.delete();
                            return b890Var7;
                        } catch (Exception e9) {
                            e = e9;
                            file = file2;
                            r4 = r13;
                            Logger.m3974j(e, "Upload failed for file=" + r4, new Object[i]);
                            pqm0 pqm0VarM69840u4 = pft0.m69840u("error_reason", "");
                            message = e.getMessage();
                            if (message == null) {
                                message = "Upload failed";
                            }
                            pqm0VarArr = new pqm0[]{pqm0VarM69840u4, pft0.m69840u("error_message", message), pft0.m69840u("file_name", r4)};
                            qcoVar = new qco(i);
                            while (i2 < 3) {
                                pqm0 pqm0Var12 = pqm0VarArr[i2];
                                qcoVar.m72560c(pqm0Var12.f180351b, (String) pqm0Var12.f180350a);
                            }
                            b890 b890Var8 = new b890(qcoVar.m72559a());
                            file.delete();
                            return b890Var8;
                        }
                    } catch (AttachmentUploadException e10) {
                        e = e10;
                        r14 = strM77815d3;
                    } catch (Exception e11) {
                        e = e11;
                        r13 = strM77815d3;
                    }
                } catch (AttachmentUploadException e12) {
                    e = e12;
                    file = file2;
                    r5 = strM77815d3;
                } catch (Exception e13) {
                    e = e13;
                    file = file2;
                    r4 = strM77815d3;
                }
            } catch (CancellationException e14) {
                throw e14;
            } catch (Throwable th) {
                th = th;
                r1 = file2;
                r1.delete();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
