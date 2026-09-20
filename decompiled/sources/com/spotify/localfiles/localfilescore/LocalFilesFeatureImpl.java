package com.spotify.localfiles.localfilescore;

import android.net.Uri;
import com.google.protobuf.Empty;
import com.spotify.local_files_esperanto.proto.EsLocalFiles$DefaultSource;
import com.spotify.local_files_esperanto.proto.EsLocalFiles$Folder;
import com.spotify.local_files_esperanto.proto.EsLocalFiles$GetSourcesResponse;
import com.spotify.localfiles.localfilesmonorepo.AddedLocalFile;
import com.spotify.localfiles.localfilesmonorepo.LocalFilesFeature;
import com.spotify.localfiles.mediastore.OpenedAudioFiles;
import java.util.Iterator;
import kotlin.Metadata;
import p204p.aca0;
import p204p.ae50;
import p204p.bga;
import p204p.clw;
import p204p.dlw;
import p204p.fbk;
import p204p.fiz;
import p204p.ibk;
import p204p.ica0;
import p204p.kpo;
import p204p.mp80;
import p204p.niz;
import p204p.w2a1;
import p204p.wj50;
import p204p.x09;
import p204p.yuk;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m24211d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0082@¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018¨\u0006\u0019"}, m24212d2 = {"Lcom/spotify/localfiles/localfilescore/LocalFilesFeatureImpl;", "Lcom/spotify/localfiles/localfilesmonorepo/LocalFilesFeature;", "Lcom/spotify/localfiles/mediastore/OpenedAudioFiles;", "openedAudioFiles", "Lp/aca0;", "localFilesClient", "<init>", "(Lcom/spotify/localfiles/mediastore/OpenedAudioFiles;Lp/aca0;)V", "Lp/w2a1;", "clearLocalFileSources", "(Lp/fbk;)Ljava/lang/Object;", "", x09.f256832d, "setEnabled", "(ZLp/fbk;)Ljava/lang/Object;", "Lp/fiz;", "isEnabled", "()Lp/fiz;", "Landroid/net/Uri;", "uri", "Lcom/spotify/localfiles/localfilesmonorepo/AddedLocalFile;", "addTemporaryFile", "(Landroid/net/Uri;)Lcom/spotify/localfiles/localfilesmonorepo/AddedLocalFile;", "Lcom/spotify/localfiles/mediastore/OpenedAudioFiles;", "Lp/aca0;", "src_main_java_com_spotify_localfiles_localfilescore-localfilescore"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class LocalFilesFeatureImpl implements LocalFilesFeature {
    private final aca0 localFilesClient;
    private final OpenedAudioFiles openedAudioFiles;

    /* JADX INFO: renamed from: com.spotify.localfiles.localfilescore.LocalFilesFeatureImpl$clearLocalFileSources$1 */
    @kpo(m57054c = "com.spotify.localfiles.localfilescore.LocalFilesFeatureImpl", m57055f = "LocalFilesFeatureImpl.kt", m57056l = {39, 40}, m57057m = "clearLocalFileSources", m57058v = 2)
    @Metadata(m24213k = 3, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final class C08481 extends ibk {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        public C08481(fbk<? super C08481> fbkVar) {
            super(fbkVar);
        }

        @Override // p204p.ly8
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LocalFilesFeatureImpl.this.clearLocalFileSources(this);
        }
    }

    /* JADX INFO: renamed from: com.spotify.localfiles.localfilescore.LocalFilesFeatureImpl$setEnabled$1 */
    @kpo(m57054c = "com.spotify.localfiles.localfilescore.LocalFilesFeatureImpl", m57055f = "LocalFilesFeatureImpl.kt", m57056l = {20, 21, 27, 29}, m57057m = "setEnabled", m57058v = 2)
    @Metadata(m24213k = 3, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final class C08501 extends ibk {
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C08501(fbk<? super C08501> fbkVar) {
            super(fbkVar);
        }

        @Override // p204p.ly8
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LocalFilesFeatureImpl.this.setEnabled(false, this);
        }
    }

    public LocalFilesFeatureImpl(OpenedAudioFiles openedAudioFiles, aca0 aca0Var) {
        this.openedAudioFiles = openedAudioFiles;
        this.localFilesClient = aca0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:22:0x0075  */
    /* JADX WARN: Code duplicated, block: B:28:0x0099 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:? A[LOOP:0: B:20:0x006f->B:30:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0060, code lost:
    
        if (r9 == r5) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object clearLocalFileSources(fbk<? super w2a1> fbkVar) {
        C08481 c08481;
        Iterator it;
        int i;
        EsLocalFiles$Folder esLocalFiles$Folder;
        aca0 aca0Var;
        if (fbkVar instanceof C08481) {
            c08481 = (C08481) fbkVar;
            int i2 = c08481.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c08481.label = i2 - Integer.MIN_VALUE;
            } else {
                c08481 = new C08481(fbkVar);
            }
        } else {
            c08481 = new C08481(fbkVar);
        }
        Object objM50244b = c08481.result;
        int i3 = c08481.label;
        yuk yukVar = yuk.f276404a;
        if (i3 != 0) {
            if (i3 == 1) {
                bga.m29073P(objM50244b);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i = c08481.I$0;
                it = (Iterator) c08481.L$2;
                bga.m29073P(objM50244b);
            }
            while (it.hasNext()) {
                esLocalFiles$Folder = (EsLocalFiles$Folder) it.next();
                aca0Var = this.localFilesClient;
                wj50.m88279p(esLocalFiles$Folder);
                c08481.L$0 = null;
                c08481.L$1 = null;
                c08481.L$2 = it;
                c08481.L$3 = null;
                c08481.L$4 = null;
                c08481.I$0 = i;
                c08481.I$1 = 0;
                c08481.label = 2;
                if (((ica0) aca0Var).m50247e(esLocalFiles$Folder, c08481) == yukVar) {
                    return yukVar;
                }
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM50244b);
        aca0 aca0Var2 = this.localFilesClient;
        Empty empty = (Empty) Empty.m1934o().build();
        c08481.label = 1;
        objM50244b = ((ica0) aca0Var2).m50244b(empty, c08481);
        it = ((EsLocalFiles$GetSourcesResponse) objM50244b).m13151o().iterator();
        i = 0;
        while (it.hasNext()) {
            esLocalFiles$Folder = (EsLocalFiles$Folder) it.next();
            aca0Var = this.localFilesClient;
            wj50.m88279p(esLocalFiles$Folder);
            c08481.L$0 = null;
            c08481.L$1 = null;
            c08481.L$2 = it;
            c08481.L$3 = null;
            c08481.L$4 = null;
            c08481.I$0 = i;
            c08481.I$1 = 0;
            c08481.label = 2;
            if (((ica0) aca0Var).m50247e(esLocalFiles$Folder, c08481) == yukVar) {
                return yukVar;
            }
        }
        return w2a1.f247311a;
    }

    @Override // com.spotify.localfiles.localfilesmonorepo.LocalFilesFeature
    public AddedLocalFile addTemporaryFile(Uri uri) {
        return this.openedAudioFiles.addTemporary(uri);
    }

    @Override // com.spotify.localfiles.localfilesmonorepo.LocalFilesFeature
    public fiz isEnabled() {
        final mp80 mp80Var = new mp80(((ica0) this.localFilesClient).callStream("spotify.local_files_esperanto.proto.LocalFiles", "SubscribeSources", (Empty) Empty.m1934o().build()), 22);
        return new fiz() { // from class: com.spotify.localfiles.localfilescore.LocalFilesFeatureImpl$isEnabled$$inlined$map$1

            /* JADX INFO: renamed from: com.spotify.localfiles.localfilescore.LocalFilesFeatureImpl$isEnabled$$inlined$map$1$2 */
            @Metadata(m24213k = 3, m24214mv = {2, 3, 0}, m24216xi = 48)
            public static final class C08492<T> implements niz {
                final /* synthetic */ niz $this_unsafeFlow;

                /* JADX INFO: renamed from: com.spotify.localfiles.localfilescore.LocalFilesFeatureImpl$isEnabled$$inlined$map$1$2$1, reason: invalid class name */
                @kpo(m57054c = "com.spotify.localfiles.localfilescore.LocalFilesFeatureImpl$isEnabled$$inlined$map$1$2", m57055f = "LocalFilesFeatureImpl.kt", m57056l = {217}, m57057m = "emit", m57058v = 2)
                @Metadata(m24213k = 3, m24214mv = {2, 3, 0}, m24216xi = 48)
                public static final class AnonymousClass1 extends ibk {
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    Object L$4;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(fbk fbkVar) {
                        super(fbkVar);
                    }

                    @Override // p204p.ly8
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C08492.this.emit(null, this);
                    }
                }

                public C08492(niz nizVar) {
                    this.$this_unsafeFlow = nizVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // p204p.niz
                public final Object emit(Object obj, fbk fbkVar) {
                    AnonymousClass1 anonymousClass1;
                    boolean z;
                    if (fbkVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) fbkVar;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(fbkVar);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(fbkVar);
                    }
                    Object obj2 = anonymousClass1.result;
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        bga.m29073P(obj2);
                        niz nizVar = this.$this_unsafeFlow;
                        ae50 ae50VarM13150n = ((EsLocalFiles$GetSourcesResponse) obj).m13150n();
                        if (!ae50VarM13150n.isEmpty()) {
                            Iterator<E> it = ae50VarM13150n.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    z = false;
                                    break;
                                }
                                EsLocalFiles$DefaultSource esLocalFiles$DefaultSource = (EsLocalFiles$DefaultSource) it.next();
                                if (esLocalFiles$DefaultSource.getEnabled() && esLocalFiles$DefaultSource.m13144p() == dlw.ANDROID_MEDIA_STORE) {
                                    z = true;
                                    break;
                                }
                            }
                        } else {
                            z = false;
                            break;
                        }
                        Boolean boolValueOf = Boolean.valueOf(z);
                        anonymousClass1.L$0 = null;
                        anonymousClass1.L$1 = null;
                        anonymousClass1.L$2 = null;
                        anonymousClass1.L$3 = null;
                        anonymousClass1.I$0 = 0;
                        anonymousClass1.label = 1;
                        Object objEmit = nizVar.emit(boolValueOf, anonymousClass1);
                        yuk yukVar = yuk.f276404a;
                        if (objEmit == yukVar) {
                            return yukVar;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bga.m29073P(obj2);
                    }
                    return w2a1.f247311a;
                }
            }

            @Override // p204p.fiz
            public Object collect(niz nizVar, fbk fbkVar) {
                Object objCollect = mp80Var.collect(new C08492(nizVar), fbkVar);
                return objCollect == yuk.f276404a ? objCollect : w2a1.f247311a;
            }
        };
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00b2 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.spotify.localfiles.localfilesmonorepo.LocalFilesFeature
    public Object setEnabled(boolean z, fbk<? super w2a1> fbkVar) {
        C08501 c08501;
        aca0 aca0Var;
        Empty empty;
        if (fbkVar instanceof C08501) {
            c08501 = (C08501) fbkVar;
            int i = c08501.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c08501.label = i - Integer.MIN_VALUE;
            } else {
                c08501 = new C08501(fbkVar);
            }
        } else {
            c08501 = new C08501(fbkVar);
        }
        Object obj = c08501.result;
        int i2 = c08501.label;
        w2a1 w2a1Var = w2a1.f247311a;
        Object obj2 = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(obj);
            if (z) {
                c08501.Z$0 = z;
                c08501.label = 1;
                if (clearLocalFileSources(c08501) != obj2) {
                }
            } else {
                aca0 aca0Var2 = this.localFilesClient;
                clw clwVarM13143q = EsLocalFiles$DefaultSource.m13143q();
                clwVarM13143q.m33347q();
                clwVarM13143q.m33346m(false);
                EsLocalFiles$DefaultSource esLocalFiles$DefaultSource = (EsLocalFiles$DefaultSource) clwVarM13143q.build();
                c08501.Z$0 = z;
                c08501.label = 4;
                if (((ica0) aca0Var2).m50245c(esLocalFiles$DefaultSource, c08501) != obj2) {
                    return w2a1Var;
                }
            }
            return obj2;
        }
        if (i2 == 1) {
            z = c08501.Z$0;
            bga.m29073P(obj);
        } else {
            if (i2 != 2) {
                if (i2 == 3) {
                    bga.m29073P(obj);
                    return w2a1Var;
                }
                if (i2 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(obj);
                return w2a1Var;
            }
            z = c08501.Z$0;
            bga.m29073P(obj);
        }
        aca0Var = this.localFilesClient;
        empty = (Empty) Empty.m1934o().build();
        c08501.Z$0 = z;
        c08501.label = 3;
        if (((ica0) aca0Var).m50246d(empty, c08501) != obj2) {
            return obj2;
        }
        return w2a1Var;
        aca0 aca0Var3 = this.localFilesClient;
        clw clwVarM13143q2 = EsLocalFiles$DefaultSource.m13143q();
        clwVarM13143q2.m33347q();
        clwVarM13143q2.m33346m(true);
        EsLocalFiles$DefaultSource esLocalFiles$DefaultSource2 = (EsLocalFiles$DefaultSource) clwVarM13143q2.build();
        c08501.Z$0 = z;
        c08501.label = 2;
        if (((ica0) aca0Var3).m50245c(esLocalFiles$DefaultSource2, c08501) != obj2) {
            aca0Var = this.localFilesClient;
            empty = (Empty) Empty.m1934o().build();
            c08501.Z$0 = z;
            c08501.label = 3;
            if (((ica0) aca0Var).m50246d(empty, c08501) != obj2) {
                return w2a1Var;
            }
        }
        return obj2;
    }
}
