package com.spotify.superconnect.pairingapi;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m24211d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0005\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0005\b\t\n\u000b\f¨\u0006\r"}, m24212d2 = {"Lcom/spotify/superconnect/pairingapi/SuperConnectPairingKeyStoreError;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "StorageUnavailable", "InvalidKeyLength", "EmptyHierarchyID", "NoPendingKey", "NoActiveKey", "Lcom/spotify/superconnect/pairingapi/SuperConnectPairingKeyStoreError$EmptyHierarchyID;", "Lcom/spotify/superconnect/pairingapi/SuperConnectPairingKeyStoreError$InvalidKeyLength;", "Lcom/spotify/superconnect/pairingapi/SuperConnectPairingKeyStoreError$NoActiveKey;", "Lcom/spotify/superconnect/pairingapi/SuperConnectPairingKeyStoreError$NoPendingKey;", "Lcom/spotify/superconnect/pairingapi/SuperConnectPairingKeyStoreError$StorageUnavailable;", "src_main_java_com_spotify_superconnect_pairingapi-pairingapi"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public abstract class SuperConnectPairingKeyStoreError extends Exception {

    @Metadata(m24211d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m24212d2 = {"Lcom/spotify/superconnect/pairingapi/SuperConnectPairingKeyStoreError$EmptyHierarchyID;", "Lcom/spotify/superconnect/pairingapi/SuperConnectPairingKeyStoreError;", "<init>", "()V", "src_main_java_com_spotify_superconnect_pairingapi-pairingapi"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final class EmptyHierarchyID extends SuperConnectPairingKeyStoreError {
        public EmptyHierarchyID() {
            super("Hierarchy ID must not be empty", null);
        }
    }

    @Metadata(m24211d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m24212d2 = {"Lcom/spotify/superconnect/pairingapi/SuperConnectPairingKeyStoreError$InvalidKeyLength;", "Lcom/spotify/superconnect/pairingapi/SuperConnectPairingKeyStoreError;", "<init>", "()V", "src_main_java_com_spotify_superconnect_pairingapi-pairingapi"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final class InvalidKeyLength extends SuperConnectPairingKeyStoreError {
        public InvalidKeyLength() {
            super("Key must be exactly 32 bytes", null);
        }
    }

    @Metadata(m24211d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m24212d2 = {"Lcom/spotify/superconnect/pairingapi/SuperConnectPairingKeyStoreError$NoActiveKey;", "Lcom/spotify/superconnect/pairingapi/SuperConnectPairingKeyStoreError;", "<init>", "()V", "src_main_java_com_spotify_superconnect_pairingapi-pairingapi"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final class NoActiveKey extends SuperConnectPairingKeyStoreError {
        public NoActiveKey() {
            super("No active pairing", null);
        }
    }

    @Metadata(m24211d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m24212d2 = {"Lcom/spotify/superconnect/pairingapi/SuperConnectPairingKeyStoreError$NoPendingKey;", "Lcom/spotify/superconnect/pairingapi/SuperConnectPairingKeyStoreError;", "<init>", "()V", "src_main_java_com_spotify_superconnect_pairingapi-pairingapi"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final class NoPendingKey extends SuperConnectPairingKeyStoreError {
        public NoPendingKey() {
            super("No pending key", null);
        }
    }

    @Metadata(m24211d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m24212d2 = {"Lcom/spotify/superconnect/pairingapi/SuperConnectPairingKeyStoreError$StorageUnavailable;", "Lcom/spotify/superconnect/pairingapi/SuperConnectPairingKeyStoreError;", "src_main_java_com_spotify_superconnect_pairingapi-pairingapi"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final class StorageUnavailable extends SuperConnectPairingKeyStoreError {
        public StorageUnavailable(Throwable th) {
            super("Storage unavailable", th);
        }
    }
}
