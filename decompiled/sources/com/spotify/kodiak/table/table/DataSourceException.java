package com.spotify.kodiak.table.table;

import java.util.LinkedHashSet;
import kotlin.Metadata;
import p204p.k35;
import p204p.wj50;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m24211d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0003\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0003\b\t\n¨\u0006\u000b"}, m24212d2 = {"Lcom/spotify/kodiak/table/table/DataSourceException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "()V", "UnsupportedKey", "UnsupportedKeys", "InvalidAction", "Lcom/spotify/kodiak/table/table/DataSourceException$InvalidAction;", "Lcom/spotify/kodiak/table/table/DataSourceException$UnsupportedKey;", "Lcom/spotify/kodiak/table/table/DataSourceException$UnsupportedKeys;", "src_main_java_com_spotify_kodiak_table-table"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public abstract class DataSourceException extends Exception {

    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m24211d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m24212d2 = {"Lcom/spotify/kodiak/table/table/DataSourceException$InvalidAction;", "Lcom/spotify/kodiak/table/table/DataSourceException;", "src_main_java_com_spotify_kodiak_table-table"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final /* data */ class InvalidAction extends DataSourceException {

        /* JADX INFO: renamed from: a */
        public final k35 f5003a;

        /* JADX INFO: renamed from: b */
        public final Object f5004b;

        public InvalidAction(k35 k35Var, Object obj) {
            super(0);
            this.f5003a = k35Var;
            this.f5004b = obj;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InvalidAction)) {
                return false;
            }
            InvalidAction invalidAction = (InvalidAction) obj;
            return wj50.m88271j(this.f5003a, invalidAction.f5003a) && wj50.m88271j(this.f5004b, invalidAction.f5004b);
        }

        public final int hashCode() {
            return this.f5004b.hashCode() + (this.f5003a.f118764c * 31);
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m24211d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m24212d2 = {"Lcom/spotify/kodiak/table/table/DataSourceException$UnsupportedKey;", "Lcom/spotify/kodiak/table/table/DataSourceException;", "src_main_java_com_spotify_kodiak_table-table"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final /* data */ class UnsupportedKey extends DataSourceException {

        /* JADX INFO: renamed from: a */
        public final k35 f5005a;

        public UnsupportedKey(k35 k35Var) {
            super(0);
            this.f5005a = k35Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UnsupportedKey) && wj50.m88271j(this.f5005a, ((UnsupportedKey) obj).f5005a);
        }

        public final int hashCode() {
            return this.f5005a.f118764c;
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m24211d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m24212d2 = {"Lcom/spotify/kodiak/table/table/DataSourceException$UnsupportedKeys;", "Lcom/spotify/kodiak/table/table/DataSourceException;", "src_main_java_com_spotify_kodiak_table-table"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final /* data */ class UnsupportedKeys extends DataSourceException {

        /* JADX INFO: renamed from: a */
        public final LinkedHashSet f5006a;

        public UnsupportedKeys(LinkedHashSet linkedHashSet) {
            super(0);
            this.f5006a = linkedHashSet;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UnsupportedKeys) && wj50.m88271j(this.f5006a, ((UnsupportedKeys) obj).f5006a);
        }

        public final int hashCode() {
            return this.f5006a.hashCode();
        }
    }

    public /* synthetic */ DataSourceException(int i) {
        this();
    }

    private DataSourceException() {
    }
}
