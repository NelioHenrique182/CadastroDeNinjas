
-- V2: Migrations para adicionar a coluna "rank" na tabela "tb_cadastro"

ALTER TABLE TB_CADASTRO
ADD COLUMN RANK VARCHAR(255);